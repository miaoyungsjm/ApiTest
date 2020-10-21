package com.excellent.apitest.db.dao;

import com.excellent.apitest.db.entity.Favorite;
import com.excellent.apitest.db.entity.Movie;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

/**
 * @author ggz
 * @date 2020/10/21
 */
@Dao
public interface FavoriteDao {
    @Insert
    void insertFavorite(Favorite... movies);

    @Delete
    void deleteFavorite(Favorite... movies);

    @Update
    void updateFavorite(Favorite... movies);

    @Query("SELECT * FROM Favorite")
    List<Favorite> getAllFavorite();
}
