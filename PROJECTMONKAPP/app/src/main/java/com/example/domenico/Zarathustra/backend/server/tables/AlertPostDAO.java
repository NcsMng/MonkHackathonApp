package com.example.domenico.Zarathustra.backend.server.tables;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

@Dao
public interface AlertPostDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(AlertPost p);

    @Query("SELECT * FROM AlertPost")
    AlertPost[] getAlertPosts();

    @Query("DELETE FROM AlertPost WHERE id =:id")
    void deleteAlertPost(long id);
}
