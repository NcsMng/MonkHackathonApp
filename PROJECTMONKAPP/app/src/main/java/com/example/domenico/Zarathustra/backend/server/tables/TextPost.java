package com.example.domenico.Zarathustra.backend.server.tables;

import android.arch.persistence.room.Entity;

import java.time.LocalDateTime;

@Entity
public class TextPost extends Post{
	public TextPost(String title, User author, String content,LocalDateTime submittingTime){
		super(title, author, content, submittingTime);
	}
}