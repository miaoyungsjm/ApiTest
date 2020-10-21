package com.excellent.apitest.db.entity;

import com.google.gson.annotations.SerializedName;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * @author ggz
 * @date 2020/10/20
 */
@Entity
public class Tv {
    @PrimaryKey(autoGenerate = false)
    private int id;
    @SerializedName("original_name")
    @ColumnInfo(name = "original_name")
    private String originalName;
    @SerializedName("name")
    @ColumnInfo(name = "name")
    private String name;
    @SerializedName("original_language")
    @ColumnInfo(name = "original_language")
    private String originalLanguage;
    @SerializedName("first_air_date")
    @ColumnInfo(name = "first_air_date")
    private String firstAirDate;
    @SerializedName("poster_path")
    @ColumnInfo(name = "poster_path")
    private String posterPath;
    @SerializedName("backdrop_path")
    @ColumnInfo(name = "backdrop_path")
    private String backdropPath;
    @SerializedName("overview")
    @ColumnInfo(name = "overview")
    private String overview;
    @SerializedName("vote_average")
    @ColumnInfo(name = "vote_average")
    private double voteAverage;
    @SerializedName("popularity")
    @ColumnInfo(name = "popularity")
    private double popularity;
    @SerializedName("vote_count")
    @ColumnInfo(name = "vote_count")
    private int voteCount;

    public Tv(int id, String originalName, String name, String originalLanguage, String firstAirDate, String posterPath, String backdropPath, String overview, double voteAverage, double popularity, int voteCount) {
        this.id = id;
        this.originalName = originalName;
        this.name = name;
        this.originalLanguage = originalLanguage;
        this.firstAirDate = firstAirDate;
        this.posterPath = posterPath;
        this.backdropPath = backdropPath;
        this.overview = overview;
        this.voteAverage = voteAverage;
        this.popularity = popularity;
        this.voteCount = voteCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getFirstAirDate() {
        return firstAirDate;
    }

    public void setFirstAirDate(String firstAirDate) {
        this.firstAirDate = firstAirDate;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }
}
