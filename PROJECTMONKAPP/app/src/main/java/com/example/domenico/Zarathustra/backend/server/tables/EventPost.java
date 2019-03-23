package com.example.domenico.Zarathustra.backend.server;

public class EventPost extends Post{
	private LocalDateTime date;

	public EventPost(int id, String title, User author, String content,LocalDateTime	submittingTime, LocalDateTime date){
		super(id, title, author, content, submittingTime);
		this.date = date;
	}
	
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	public LocalDateTime getDate(){
		return this.date;
	}
}