package fr.gamingdy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;


@Entity // This tells Hibernate to make a table out of this class
public class Account {
	public enum Role {
		MODERATOR, PUBLISHER
	}

	@Setter
	@Getter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Setter
	@Getter
	@Column(unique = true)
	private String username;

	@Setter
	@Getter
	private String password;

	@Setter
	@Getter
	@Enumerated(EnumType.STRING)
	private Role role;

	@OneToMany(mappedBy = "author")
	@Getter
	private Collection<Post> post;


}