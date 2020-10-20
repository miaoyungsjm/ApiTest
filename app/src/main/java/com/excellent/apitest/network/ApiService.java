package com.excellent.apitest.network;

import com.excellent.apitest.bean.response.MovieCredits;
import com.excellent.apitest.bean.response.SearchMovie;
import com.excellent.apitest.bean.response.PopularMovie;
import com.excellent.apitest.bean.response.PopularTv;
import com.excellent.apitest.bean.response.SearchTv;
import com.excellent.apitest.bean.response.TvCredits;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author ggz
 * @date 2020/10/19
 */
public interface ApiService {
    String BASE_URL = "https://api.themoviedb.org/3/";

    @GET("tv/popular")
    Observable<PopularTv> queryPopularTv(
            @Query("api_key") String key,
            @Query("page") int page);

    @GET("tv/{id}/credits")
    Observable<TvCredits> queryTvCredits(
            @Path("id") int id,
            @Query("api_key") String key);

    @GET("movie/popular")
    Observable<PopularMovie> queryPopularMovie(
            @Query("api_key") String key,
            @Query("page") int page);

    @GET("movie/{id}/credits")
    Observable<MovieCredits> queryMovieCredits(
            @Path("id") int id,
            @Query("api_key") String key);

    @GET("search/movie")
    Observable<SearchMovie> searchMovie(
            @Query("api_key") String key,
            @Query("query") String query,
            @Query("page") int page);

    @GET("search/tv")
    Observable<SearchTv> searchTv(
            @Query("api_key") String key,
            @Query("query") String query,
            @Query("page") int page);
}
