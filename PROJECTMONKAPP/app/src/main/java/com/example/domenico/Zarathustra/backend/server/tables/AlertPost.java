package com.example.domenico.Zarathustra.backend.server;

public class AlertPost extends Post{
	
	public AlertPost(int id, String title, User author, String content, LocalDateTime submittingTime){
		super(id, title, author, content, submittingTime);
	}
}