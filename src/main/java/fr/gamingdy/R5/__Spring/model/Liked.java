package fr.gamingdy.R5.__Spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;

@Entity
public class Liked {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@OneToOne
	@JoinColumn(name = "post_id")
	private Post post;

	@OneToOne
	@JoinColumn(name = "author_id")
	private Account author;

	@Getter
	private Boolean isLike;
}
