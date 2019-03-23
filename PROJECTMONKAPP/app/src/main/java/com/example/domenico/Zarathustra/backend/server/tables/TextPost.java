package com.example.domenico.Zarathustra.backend.server;

public class TextPost extends Post{
	public TextPost(String title, User author, String content,LocalDateTime submittingTime){
		super(title, author, content, submittingTime);
	}
}