package com.excellent.apitest.db.dao;

import com.excellent.apitest.db.entity.Movie;
import com.excellent.apitest.db.entity.Tv;

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
public interface MovieDao {
    @Insert
    void insertMovie(Movie... movies);

    @Delete
    void deleteMovie(Movie... movies);

    @Update
    void updateMovie(Movie... movies);

    @Query("SELECT * FROM Movie")
    List<Movie> getAllMovie();

    @Query("SELECT * FROM Movie WHERE id == :id")
    Movie getMovie(int id);
}
