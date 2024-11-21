package fr.gamingdy.R5.__Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/bonjour")
	public String index() {
		return "FEUR!";
	}

}