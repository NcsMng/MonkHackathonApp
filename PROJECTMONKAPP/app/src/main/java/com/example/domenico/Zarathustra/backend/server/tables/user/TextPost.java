package com.example.domenico.Zarathustra.backend.server.tables.user;

import java.util.Date;

public class TextPost extends Post{
	private static final long serialVersionUID = -2572159124006482276L;

	public TextPost(String title, User author, String content, Date submittingTime){
		super(title, author, content, submittingTime);
	}
}