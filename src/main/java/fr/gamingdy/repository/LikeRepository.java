package fr.gamingdy.repository;

import fr.gamingdy.model.Liked;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Liked, Long> {
}
