package fr.gamingdy.controller;

import fr.gamingdy.model.Post;
import fr.gamingdy.repository.PostRepository;
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
@RequestMapping("/post")
public class PostController {
	private final PostRepository postRepository;

	public PostController(PostRepository postRepository) {
		this.postRepository = postRepository;
	}

	@GetMapping("/")
	List<Post> index() {

		return this.postRepository.findAll();
	}

	@PostMapping("/")
	Post create(@RequestBody Post post) {

		this.postRepository.save(post);

		return post;
	}

	@DeleteMapping("/{id}")
	void delete(@PathVariable long id) {
		Optional<Post> post = this.postRepository.findById(id);
		if (post.isEmpty()) {
			return;
		}
		this.postRepository.deleteById(id);
	}
}

