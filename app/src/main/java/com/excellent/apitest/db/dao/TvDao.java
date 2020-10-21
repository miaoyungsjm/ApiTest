package com.excellent.apitest.db.dao;

import com.excellent.apitest.db.entity.Tv;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

/**
 * @author ggz
 * @date 2020/10/21
 */
@Dao
public interface TvDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTv(Tv... tv);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTvs(List<Tv> list);

    @Delete
    void deleteTv(Tv... tv);

    @Update
    void updateTv(Tv... tv);

    @Query("SELECT * FROM Tv")
    List<Tv> getAllTv();

    @Query("SELECT * FROM Tv WHERE id == :id")
    Tv getTv(int id);

//    @Query("SELECT * FROM Tv " +
//            "INNER JOIN Favorite ON Favorite.type = 1 AND Favorite.id = Tv.id ")
//    List<Tv> getFavoriteTv();
}
