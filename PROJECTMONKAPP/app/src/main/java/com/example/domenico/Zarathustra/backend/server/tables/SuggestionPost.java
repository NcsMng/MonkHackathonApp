package com.example.domenico.Zarathustra.backend.server;

public class SuggestionPost extends Post{
	List<User> likes;


	public SuggestionPost(String title, User author, String content){
		super(title, author, content);
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
				return true
		return false;
	}

	public int getLikesAmount(){ return likes.size();}
}