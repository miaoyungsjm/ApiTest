package com.excellent.apitest.network;

import com.excellent.apitest.network.response.CreditsMovie;
import com.excellent.apitest.network.response.CreditsTv;
import com.excellent.apitest.network.response.DiscoverMovie;
import com.excellent.apitest.network.response.DiscoverTv;
import com.excellent.apitest.network.response.PopularMovie;
import com.excellent.apitest.network.response.PopularTv;
import com.excellent.apitest.network.response.SearchMovie;
import com.excellent.apitest.network.response.SearchTv;

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

    @GET("movie/popular")
    Observable<PopularMovie> queryPopularMovie(
            @Query("api_key") String key,
            @Query("page") int page);

    @GET("movie/{id}/credits")
    Observable<CreditsMovie> queryMovieCredits(
            @Path("id") int id,
            @Query("api_key") String key);

    @GET("tv/{id}/credits")
    Observable<CreditsTv> queryTvCredits(
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

    @GET("discover/movie")
    Observable<DiscoverMovie> discoverMovie(
            @Query("api_key") String key,
            @Query("sort_by") String query,
            @Query("page") int page);

    @GET("discover/tv")
    Observable<DiscoverTv> discoverTv(
            @Query("api_key") String key,
            @Query("sort_by") String query,
            @Query("page") int page);
}
