package com.example.domenico.Zarathustra.backend.server.tables;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;

import java.io.Serializable;


@Entity(foreignKeys = @ForeignKey(entity = User.class,parentColumns = "id",childColumns = "authorId",onDelete = ForeignKey.CASCADE))
public class AlertPost extends Post {
	private static final long serialVersionUID = 5888406227L;
	public AlertPost(){}
    @Ignore
	public AlertPost(String title, long author, String content, long submittingTime){
		super(title, author, content, submittingTime);
	}
}