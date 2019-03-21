package com.ourTeam.search.impl;

import com.ourTeam.search.SearchDao;
import com.ourTeam.search.SearchResult;
import com.ourTeam.search.SearchService;
import org.apache.solr.client.solrj.SolrQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hcoly1
 * @create 2019-03-12-10:45
 */
@Service("searchServiceImpl")
public class SearchServiceImpl implements SearchService {

    @Autowired
    private SearchDao searchDao;

    /**
     * 实现搜索服务，创建solr搜索条件，将条件传递给Dao层进行查询
     * @param queryString
     * @param page
     * @param rows
     * @return
     * @throws Exception
     */
    @Override
    public SearchResult search(String queryString, int page, int rows) throws Exception {

        // 创建查询条件
        SolrQuery query = new SolrQuery();

        // 设置查询条件
        query.setQuery(queryString);
        // 设置分页条件
        query.setStart((page - 1)*rows);
        query.setRows(rows);

        // 设置默认搜索域为课程名
        query.set("df","cour_name");

        // 执行查询
        SearchResult searchResult = searchDao.search(query);

        return searchResult;
    }
}
