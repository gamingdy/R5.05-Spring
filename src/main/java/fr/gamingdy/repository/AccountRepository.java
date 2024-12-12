package fr.gamingdy.repository;

import fr.gamingdy.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
	Optional<Object> findByUsername(String username);
}
