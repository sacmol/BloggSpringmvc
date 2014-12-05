package se.sacha.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class BlogPost implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5503881609973865880L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String title;
	
	@Temporal(TemporalType.DATE)
	private Date postDate;
	
	@Column(columnDefinition = "TEXT")
	private String text;
	
	@SuppressWarnings("unused")
	private BlogPost(){
		
	}

	public BlogPost(Long id, String title, Date postDate, String text) {
		this.id = id;
		this.title = title;
		this.postDate = postDate;
		this.text = text;
	}

	public BlogPost(String title, Date postDate, String text) {
		this.title = title;
		this.postDate = postDate;
		this.text = text;
	}

	
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Date getPostDate() {
		return postDate;
	}

	public String getText() {
		return text;
	}

	@Override
	public String toString() {
		return "BlogPost [id=" + id + ", title=" + title + ", postDate="
				+ postDate + ", text=" + text + "]";
	}
	
	
}
