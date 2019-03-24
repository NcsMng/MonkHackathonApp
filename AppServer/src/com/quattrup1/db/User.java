package com.quattrup1.db;

import com.quattrup1.usermanager.Password;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 3950025715440442732L;
	private long sessionId;
	private String username;
	private Password password;
	
	public User(long sessionId, String username, Password password) {
		this.sessionId = sessionId;
		this.username = username;
		this.password = password;
	}
	public long getSessionId() {
		return sessionId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		else if(obj instanceof User)
			return username.equals(((User) obj).username) && password.equals(((User) obj).password);
		else
			return false;
	}
}
