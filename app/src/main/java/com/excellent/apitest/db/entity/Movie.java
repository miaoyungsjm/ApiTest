package com.excellent.apitest.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * @author ggz
 * @date 2020/10/21
 */
@Entity
public class Movie {
    @PrimaryKey(autoGenerate = false)
    private int id;
    @ColumnInfo(name = "original_name")
    private String originalTitle;
    @ColumnInfo(name = "title")
    private String title;
    @ColumnInfo(name = "original_language")
    private String originalLanguage;
    @ColumnInfo(name = "release_date")
    private String releaseDate;
    @ColumnInfo(name = "poster_path")
    private String posterPath;
    @ColumnInfo(name = "backdrop_path")
    private String backdropPath;
    @ColumnInfo(name = "overview")
    private String overview;
    @ColumnInfo(name = "vote_average")
    private double voteAverage;
    @ColumnInfo(name = "popularity")
    private double popularity;
    @ColumnInfo(name = "vote_count")
    private int voteCount;

    public Movie(int id, String originalTitle, String title, String originalLanguage, String releaseDate, String posterPath, String backdropPath, String overview, double voteAverage, double popularity, int voteCount) {
        this.id = id;
        this.originalTitle = originalTitle;
        this.title = title;
        this.originalLanguage = originalLanguage;
        this.releaseDate = releaseDate;
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

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
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
