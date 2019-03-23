package com.example.simone.provadbroom;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class User {

	@PrimaryKey(autoGenerate = true)
	private	long id;

	private int imageId;
	private String username;
	private String password;
	private String name;
	private String surname;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
	@Ignore
	public User(long id, int imageId, String username, String password, String name, String surname) {
		this.id = id;
		this.imageId = imageId;
		this.username = username;
		this.password = password;
		this.surname=surname;
		this.name=name;
	}

	public User(int imageId, String username, String password, String name, String surname) {
		this.imageId = imageId;
		this.username = username;
		this.password = password;
		this.surname=surname;
		this.name=name;
	}

	public int getImageId() {
		return imageId;
	}
	public String getUsername() {
		return username;
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
		return password;
	}

	public String getFullName(){
	    return name+" "+surname;
    }

	
}