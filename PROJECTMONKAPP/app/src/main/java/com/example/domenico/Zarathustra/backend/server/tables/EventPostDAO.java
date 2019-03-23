package com.example.domenico.Zarathustra.backend.server.tables;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

@Dao
public interface EventPostDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(EventPost p);

    @Query("SELECT * FROM EventPost")
    EventPost[] getEventPosts();

    @Query("DELETE FROM EventPost WHERE id =:id")
    void deleteEventPost(long id);
}
