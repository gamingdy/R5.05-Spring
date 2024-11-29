package fr.gamingdy.R5.__Spring.repository;

import fr.gamingdy.R5.__Spring.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
