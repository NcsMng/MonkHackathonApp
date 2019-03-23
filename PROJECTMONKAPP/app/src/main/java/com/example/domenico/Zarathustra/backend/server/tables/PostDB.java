package com.example.simone.provadbroom;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverter;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;
import android.widget.TextView;

@Database(entities = {EventPost.class, SuggestionPost.class, AlertPost.class,TextPost.class, User.class}, version = 1, exportSchema = false)
@TypeConverters({SuggestionPost.class})
public abstract class PostDB extends RoomDatabase {
    private static PostDB instance;
    private static final String DB_NOME = "Posts";

    public static  PostDB getInstance(Context c){
        if(instance == null){
            instance = Room.databaseBuilder(c, PostDB.class, DB_NOME).allowMainThreadQueries().build();
        }
        return instance;
    }

    public abstract EventPostDAO getEventPostDao();
    public abstract SuggestionPostDAO getSuggestionPostDAO();
    public abstract AlertPostDAO getAlertPostDAO();
    public abstract TextPostDAO getTextPostDAO();
    public abstract UserDAO getUserDAO();

}
