package com.excellent.apitest.db.dao;

import com.excellent.apitest.db.entity.Tv;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Query;

/**
 * @author ggz
 * @date 2020/10/21
 */
@Dao
public interface TvDao extends BaseDao<Tv> {

    @Query("SELECT * FROM Tv")
    List<Tv> getAllTv();

    @Query("SELECT * FROM Tv WHERE id == :id")
    Tv getTv(int id);

//    @Query("SELECT * FROM Tv " +
//            "INNER JOIN Favorite ON Favorite.type = 1 AND Favorite.id = Tv.id ")
//    List<Tv> getFavoriteTv();

    @Query("SELECT * FROM Tv, Favorite " +
            "WHERE Favorite.type = 1 AND Favorite.id = Tv.id ")
    List<Tv> getFavoriteTv();
}
