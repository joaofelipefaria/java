package br.com.joaofelipefaria.payments.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.joaofelipefaria.payments.common.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
