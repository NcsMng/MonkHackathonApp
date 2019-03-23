package com.example.domenico.Zarathustra.backend.server;

public class TextPost extends Post{
	public TextPost(int id, String title, User author, String content,LocalDateTime submittingTime){
		super(id, title, author, content, submittingTime);
	}
}