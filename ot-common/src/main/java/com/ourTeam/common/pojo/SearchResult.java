package com.ourTeam.common.pojo;

import java.io.Serializable;
import java.util.List;

public class SearchResult implements Serializable {

    private int totalPages;

    private List<SearchItem> itemList;

    private int recourdCount;

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<SearchItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<SearchItem> itemList) {
        this.itemList = itemList;
    }

    public int getRecourdCount() {
        return recourdCount;
    }

    public void setRecourdCount(int recourdCount) {
        this.recourdCount = recourdCount;
    }
}
