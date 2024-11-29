package fr.gamingdy.R5.__Spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

import java.sql.Date;

@Entity
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date published_date;

	@ManyToOne
	@JoinColumn(name = "author_id")
	private Account author;

	@Getter
	private String content;
	private String title;
}
