package com.example.domenico.Zarathustra.backend.server.tables;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.TypeConverter;

import java.util.StringTokenizer;

@Entity(foreignKeys = @ForeignKey(entity = User.class,parentColumns = "id",childColumns = "authorId",onDelete = ForeignKey.CASCADE))
public class SuggestionPost extends Post{
    private static final long serialVersionUID = 4807163159L;
	long[] likes;
	int filledTo=0;

	@Ignore
	private static final int INCREASE_VALUE = 10;

    public SuggestionPost(){}

    @Ignore
	public SuggestionPost(String title, long author, String content, long submittingDate){
		super(title, author, content, submittingDate);
		likes = new long[INCREASE_VALUE];

	}

	public void addLike(User liker){
		if(!contains(liker)){
			if(filledTo<likes.length){
			    likes[filledTo++]=liker.getId();
            }else{
			    long[] tmp = new long[likes.length+INCREASE_VALUE];
			    for(int i = 0;i<likes.length;i++){
			        tmp[i]=likes[i];
                }
                likes=tmp;
			    likes[filledTo++]=liker.getId();
            }
		}
	}

	private boolean contains(User liker){
		for(long i:likes)
			if(i==liker.getId())
				return true;
		return false;
	}

	public int getLikesAmount(){ return filledTo;}

    public long[] getLikes() {
        return likes;
    }


    public int getFilledTo() {
        return filledTo;
    }

    public void setFilledTo(int filledTo) {
        this.filledTo = filledTo;
    }

    public void setLikes(long[] likes) {
        this.likes = likes;
    }

    @TypeConverter
    public String longArrayToString(long[] arr){
        String s = "";
        for(long l: arr){
            s+=l+"/";
        }
        return s;
    }

    @TypeConverter
    public long[] stringToLongArray(String s){
        String[] longs = s.split("/");
        long[] arr = new long[longs.length];
        for(int i = 0 ;i<longs.length;i++){
            arr[i]=Long.parseLong(longs[i]);
        }
        return arr;
    }
}