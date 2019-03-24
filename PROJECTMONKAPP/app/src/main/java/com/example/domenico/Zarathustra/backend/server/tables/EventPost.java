package com.example.domenico.Zarathustra.backend.server.tables;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;

import java.util.Date;

@Entity(foreignKeys = @ForeignKey(entity = User.class,parentColumns = "id",childColumns = "authorId",onDelete = ForeignKey.CASCADE))
public class EventPost extends Post{
	private long date;

    public void setDate(long date) {
        this.date = date;
    }
    public EventPost(){}
    @Ignore
    public EventPost(String title, long authorId, String content, long submittingTime, long date){
		super(title, authorId, content, submittingTime);
		this.date = date;
	}

    public long getDate(){
		return this.date;
	}
    public Date getDateAsDate(){
        return new Date(this.date);
    }
}