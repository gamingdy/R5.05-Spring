package fr.gamingdy.controller;

import fr.gamingdy.model.Liked;
import fr.gamingdy.repository.LikeRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/like")
public class LikeController {
	private LikeRepository likeRepository;

	public LikeController(LikeRepository likeRepository) {
		this.likeRepository = likeRepository;
	}

	@PostMapping("/")
	String create(@RequestBody Liked liked) {
		System.out.println(liked);
		return "Like Created";
	}


}
