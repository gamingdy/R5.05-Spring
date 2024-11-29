package fr.gamingdy.R5.__Spring.repository;

import fr.gamingdy.R5.__Spring.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
	Optional<Object> findByUsername(String username);
}
