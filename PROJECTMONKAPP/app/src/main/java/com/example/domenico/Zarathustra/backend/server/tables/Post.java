package com.example.domenico.Zarathustra.backend.server;

public abstract class Post {
	private long id;
	private String Title;
	private User author;
	private String content;
	private LocalDateTime submittingTime;
	
	public Post(int id, String title, User author, String content, LocalDateTime submittingTime) {
		this.id = id;
		this.content=content;
		this.title = title;
		this.author = author;
		this.submittingTime = submittingTime;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDateTime getSubmittingTime() {
		return submittingTime;
	}
	public void setSubmittingTime(LocalDateTime submittingTime) {
		this.submittingTime = submittingTime;
	}
	public String getTitle(){ return this.title;}
	public User getAuthor(){ return this.author;}
	public String getContent(){ return this.content;}
	public LocalDateTime getContent(){ return this.submittingTime;}
}