package com.excellent.apitest.db.database;

import android.content.Context;

import com.excellent.apitest.db.dao.FavoriteDao;
import com.excellent.apitest.db.dao.MovieDao;
import com.excellent.apitest.db.dao.TvDao;
import com.excellent.apitest.db.entity.Favorite;
import com.excellent.apitest.db.entity.Movie;
import com.excellent.apitest.db.entity.Tv;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

/**
 * @author ggz
 * @date 2020/10/21
 */
@Database(entities = {Movie.class, Tv.class, Favorite.class}, version = 1, exportSchema = false)
public abstract class TMDatabase extends RoomDatabase {

    public abstract MovieDao getMovieDao();

    public abstract TvDao getTvDao();

    public abstract FavoriteDao getFavoriteDao();
}
