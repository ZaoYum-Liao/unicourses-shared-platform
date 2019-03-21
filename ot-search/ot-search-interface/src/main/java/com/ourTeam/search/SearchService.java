package com.ourTeam.search;


/**
 * @author hcoly1
 * @create 2019-03-12-10:43
 */
public interface SearchService {
    SearchResult search(String queryString, int page, int rows) throws Exception;
}
