package com.example.simone.provadbroom;

import android.arch.persistence.room.Entity;

import java.time.LocalDateTime;

@Entity
public class AlertPost extends Post{
	
	public AlertPost(String title, User author, String content, LocalDateTime submittingTime){
		super(title, author, content, submittingTime);
	}
}