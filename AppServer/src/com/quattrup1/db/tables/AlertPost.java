package com.quattrup1.db.tables;

import com.quattrup1.db.User;

import java.util.Date;

public class AlertPost extends Post {
	private static final long serialVersionUID = -3198474947161021519L;

	public AlertPost(String title, User author, String content, Date submittingTime){
		super(title, author, content, submittingTime);
	}
}