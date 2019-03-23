package com.example.domenico.Zarathustra.backend.server;

public class AlertPost extends Post{
	
	public AlertPost(String title, User author, String content, LocalDateTime submittingTime){
		super(title, author, content, submittingTime);
	}
}