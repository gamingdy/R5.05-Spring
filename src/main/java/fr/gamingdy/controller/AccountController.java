package fr.gamingdy.controller;

import fr.gamingdy.model.Account;
import fr.gamingdy.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private AccountRepository accountRepository;

	@PostMapping("/")
	String create(@RequestBody Account account) {
		if (this.accountRepository.findByUsername(account.getUsername()).isPresent()) {
			return "Username already exists";
		}

		this.accountRepository.save(account);

		return "Account Created";
	}

	@GetMapping("/")
	List<Account> index() {
		return this.accountRepository.findAll();
	}

	@DeleteMapping("/{user_id}")
	String delete(@PathVariable Long user_id) {

		Optional<Account> user = this.accountRepository.findById(user_id);

		if (user.isEmpty()) {
			return "User not found";
		}
		this.accountRepository.delete(user.get());

		return "User Deleted";
	}

}
