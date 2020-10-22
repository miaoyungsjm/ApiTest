package com.excellent.apitest.db.dao;

import com.excellent.apitest.db.entity.Favorite;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Query;

/**
 * @author ggz
 * @date 2020/10/21
 */
@Dao
public interface FavoriteDao extends BaseDao<Favorite> {

    @Query("SELECT * FROM Favorite")
    List<Favorite> getAllFavorite();
}
