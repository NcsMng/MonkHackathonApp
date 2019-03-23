package com.example.domenico.Zarathustra.backend.server.tables;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.time.LocalDateTime;


public abstract class Post{
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSubmittingTime(LocalDateTime submittingTime) {
        this.submittingTime = submittingTime;
    }

    @PrimaryKey(autoGenerate = true)
    private long id;
	private String title;
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
	public LocalDateTime getSubmittingTime(){ return this.submittingTime;}
}