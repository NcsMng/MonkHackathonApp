package com.quattrup1.db;

import com.quattrup1.usermanager.Password;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 3950025715440442732L;
	private long sessionId;
	private String username;
	private Password password;
	private String name;
	private Position position;
	private int imageId;
	
	public User(long sessionId, String username, Password password, String name, Position position, int imageId) {
		this.sessionId = sessionId;
		this.username = username;
		this.password = password;
		this.name = name;
		this.position = position;
		this.imageId = imageId;
	}
	public String getUsername() {
		return username;
	}
	public Password getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public Position getPosition() {
		return position;
	}
	public long getSessionId() {
		return sessionId;
	}
	public int getImageId() {
		return imageId;
	}
	public void setSessionId(long sessionId) {
		this.sessionId = sessionId;
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
