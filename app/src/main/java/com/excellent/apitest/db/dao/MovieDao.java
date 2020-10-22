package com.excellent.apitest.db.dao;

import com.excellent.apitest.db.entity.Movie;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Query;

/**
 * @author ggz
 * @date 2020/10/21
 */
@Dao
public interface MovieDao extends BaseDao<Movie> {

    @Query("SELECT * FROM Movie")
    List<Movie> getAllMovie();

    @Query("SELECT * FROM Movie WHERE id == :id")
    Movie getMovie(int id);
}
