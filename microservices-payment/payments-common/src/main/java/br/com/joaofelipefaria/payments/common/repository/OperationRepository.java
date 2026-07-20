package br.com.joaofelipefaria.payments.common.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.joaofelipefaria.payments.common.entities.Operation;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Long> {

    List<Operation> findByUserId(Long userId);

    List<Operation> findByAccountOriginId(Long accountId);

    List<Operation> findByAccountDestinyId(Long accountId);
}
