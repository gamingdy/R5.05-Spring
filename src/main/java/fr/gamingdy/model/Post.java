package fr.gamingdy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	private Integer id;

	@Getter
	@Setter
	private Date published_date;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "author_id")
	@Setter
	private Account author;

	@Getter
	@Setter
	private String content;

	@Getter
	@Setter
	private String title;

	public int getAuthor() {
		return author.getId();
	}

}
