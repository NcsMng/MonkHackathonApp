package com.example.domenico.Zarathustra.backend.server;

public abstract class Post{
	private String Title;
	private User author;
	private String content;
	private LocalDateTime submittingTime;

	public Post(String title, User author, String content, LocalDateTime submittingTime){
		this.content=content;
		this.title = title;
		this.author = author;
		this.submittingTime = submittingTime;
	}

	public String getTitle(){ return this.title;}
	public User getAuthor(){ return this.author;}
	public String getContent(){ return this.content;}
	public LocalDateTime getContent(){ return this.submittingTime;}
}