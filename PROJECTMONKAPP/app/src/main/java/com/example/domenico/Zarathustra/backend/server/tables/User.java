package com.example.domenico.Zarathustra.backend.server;

public class User {
	private int imageId;
	private String username;
	private String password;
	
	public User(int imageId, String username, String password) {
		this.imageId = imageId;
		this.username = username;
		this.password = password;
	}
	public int getImageId() {
		return imageId;
	}
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
}