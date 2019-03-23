package com.example.domenico.Zarathustra.backend.server.tables;

import android.arch.persistence.room.PrimaryKey;

import java.time.Instant;
import java.util.Date;


public abstract class Post{
    @PrimaryKey(autoGenerate = true)
    private long id;

    private String title;
    private long authorId;
    private String content;
    private long submittingTime;
    public Post(){}
	public Post(String title, long authorId, String content, long submittingTime){
		this.content=content;
		this.title = title;
		this.authorId = authorId;
		this.submittingTime = submittingTime;
	}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSubmittingTime(long submittingTime) {
        this.submittingTime = submittingTime;
    }

	public String getTitle(){ return this.title;}
    public long getAuthorId(){ return this.authorId;}
    public String getContent(){ return this.content;}
    public long getSubmittingTime(){ return this.submittingTime;}
    public Date getSubmittingTimeAsDate(){ return new Date(submittingTime);}
}