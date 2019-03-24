package com.example.domenico.Zarathustra.backend.server.tables;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

@Dao
public interface TextPostDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(TextPost p);

    @Query("SELECT * FROM TextPost")
    TextPost[] getTextPosts();

    @Query("DELETE FROM TextPost WHERE id =:id")
    void deleteTextPost(long id);
}
