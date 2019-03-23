package com.example.simone.provadbroom;

import android.arch.persistence.room.Entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SuggestionPost extends Post{
	List<User> likes;


	public SuggestionPost(String title, User author, String content, LocalDateTime submittingDate){
		super(title, author, content, submittingDate);
		likes = new ArrayList<>();
	}

	public void addLike(User liker){
		if(!contains(liker)){
			likes.add(liker);
		}
	}

	private boolean contains(User liker){
		for(User u:likes)
			if(u.equals(liker))
				return true;
		return false;
	}

	public int getLikesAmount(){ return likes.size();}

    public List<User> getLikes() {
        return likes;
    }

    public void setLikes(List<User> likes) {
        this.likes = likes;
    }
}