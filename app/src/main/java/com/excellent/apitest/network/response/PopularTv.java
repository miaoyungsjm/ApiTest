package com.excellent.apitest.network.response;

import com.excellent.apitest.db.entity.Tv;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author ggz
 * @date 2020/10/19
 */
public class PopularTv {
    @SerializedName("page")
    private int page;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;
    @SerializedName("results")
    private List<Tv> results;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<Tv> getResults() {
        return results;
    }

    public void setResults(List<Tv> results) {
        this.results = results;
    }
}
