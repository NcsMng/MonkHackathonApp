package com.example.domenico.Zarathustra.backend.server;

public class SuggestionPost extends Post{
	List<User> likes;


	public SuggestionPost(int id, String title, User author, String content){
		super(id, title, author, content);
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
	
	public List<User> getLikes() {
		return likes;
	}
	
	public void setLikes(List<User> likes) {
		this.likes = likes;
	}
	
	public int getLikesAmount(){ return likes.size();}
}