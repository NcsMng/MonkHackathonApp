package com.example.domenico.Zarathustra.backend.server.tables;

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
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
}