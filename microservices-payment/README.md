# Payments

O projeto Payments é uma arquitetura de microsserviços em Java com Spring Boot para simular operações financeiras simples entre contas.

## Visão geral

A solução é dividida em quatro módulos principais:

- common: biblioteca compartilhada com entidades, DTOs, repositórios e serviços base.
- credit: microsserviço responsável por processar créditos em contas.
- debit: microsserviço responsável por processar débitos em contas.
- main: aplicação orquestradora que recebe o pedido de pagamento e chama os serviços de credit e debit via Feign.

## Banco de dados

O banco PostgreSQL é inicializado com Docker Compose, no diretório de banco do projeto.

### Como subir o banco

1. Entre no diretório do banco:
   - payments-db/docker
2. Execute:
   - docker-compose up -d

O compose cria o container PostgreSQL com as credenciais e configura o banco para o projeto.

Os scripts de inicialização de usuários, contas e dados base estão localizados no projeto de banco, em:
- payments-db/scripts

Esses scripts são executados automaticamente pelo container na primeira inicialização.

## Módulos

### Common

O módulo common concentra a camada compartilhada do projeto:

- DTOs para transferência de dados entre os serviços.
- Entidades JPA mapeadas para o banco.
- Repositórios Spring Data JPA.
- Serviços de domínio para operações de crédito, débito e consulta.

Esse módulo é usado pelos microsserviços credit e debit para manter a lógica e os modelos consistentes.

### Credit

O módulo credit expõe o endpoint de crédito e é responsável por:

- receber uma solicitação de crédito;
- aplicar o valor na conta indicada;
- persistir a operação e atualizar o saldo.

### Debit

O módulo debit expõe o endpoint de débito e é responsável por:

- receber uma solicitação de débito;
- validar se a conta possui saldo suficiente;
- aplicar o valor na conta indicada;
- persistir a operação e atualizar o saldo.

### Main

O módulo main funciona como o ponto de entrada da aplicação de pagamentos.

Ele recebe uma requisição de pagamento e, em vez de acessar o banco diretamente, chama os microsserviços credit e debit através do Apache Feign.

Essa abordagem deixa a lógica de orquestração concentrada no módulo main e mantém os microsserviços especializados em uma única responsabilidade.

## Execução

Cada módulo pode ser executado com Maven:

```bash
mvn spring-boot:run
```

## Tecnologias

- Java 17
- Spring Boot 3
- Spring Data JPA
- PostgreSQL
- Docker Compose
- OpenFeign

