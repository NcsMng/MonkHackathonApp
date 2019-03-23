package com.example.domenico.Zarathustra.backend.server;

public class User {
	private int imageId;
	private String username;
	private String password;
	private String[] names;
	private String surname;
	
	public User(int imageId, String username, String password, String[] names, String surname) {
		this.imageId = imageId;
		this.username = username;
		this.password = password;
		this.names = names;
		this.surname = surname;
	}
	public String[] getNames() {
		return names;
	}
	public void setNames(String[] names) {
		this.names = names;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
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