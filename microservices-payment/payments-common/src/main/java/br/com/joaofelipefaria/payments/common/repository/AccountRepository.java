package br.com.joaofelipefaria.payments.common.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.joaofelipefaria.payments.common.entities.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByIdentifier(String identifier);

    List<Account> findByUserId(Long userId);
}
