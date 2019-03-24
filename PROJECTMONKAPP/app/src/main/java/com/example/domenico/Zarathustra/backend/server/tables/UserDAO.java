package com.example.domenico.Zarathustra.backend.server.tables;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

@Dao
public interface UserDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(User p);

    @Query("SELECT * FROM User")
    User[] getUsers();

    @Query("DELETE FROM User WHERE id =:id")
    void deleteUser(long id);

    @Query("SELECT * FROM User WHERE id=:id")
    User getUser(long id);
    
}
