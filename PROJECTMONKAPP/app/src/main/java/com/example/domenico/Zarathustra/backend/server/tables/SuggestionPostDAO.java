package com.example.simone.provadbroom;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

@Dao
public interface SuggestionPostDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(SuggestionPost p);

    @Query("SELECT * FROM SuggestionPost")
    SuggestionPost[] getSuggestionPosts();

    @Query("DELETE FROM SuggestionPost WHERE id =:id")
    void deleteSuggestionPost(long id);
}
