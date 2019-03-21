package com.ourTeam.search.impl;

import com.ourTeam.manager.pojo.CourseInfo;
import com.ourTeam.search.SearchDao;
import com.ourTeam.search.SearchResult;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hcoly1
 * @create 2019-03-12-10:31
 */
@Repository
public class SearchDaoImpl implements SearchDao {

    @Autowired
    private SolrServer solrServer;

    /**
     * 执行查询条件，从solr库中查询出符合条件的课程信息，并返回。
     *  @param query
     * @return
     * @throws Exception
     */
    @Override
    public SearchResult search(SolrQuery query) throws Exception {

        // 执行查询
        QueryResponse response = solrServer.query(query);

        // 取查询结果列表
        SolrDocumentList solrDocumentList = response.getResults();
        List<CourseInfo> list = new ArrayList<>();
        for (SolrDocument solrDocument : solrDocumentList){
            // 创建一个courseinfo对象
            CourseInfo info = new CourseInfo();
            info.setId(Long.parseLong((String)solrDocument.get("id")));
            info.setCourCode((String) solrDocument.get("cour_code"));
            info.setSchName((String) solrDocument.get("sch_name"));
            info.setCourName((String) solrDocument.get("cour_name"));
            info.setCourInfo((String) solrDocument.get("cour_detail"));

            list.add(info);
        }
        SearchResult result = new SearchResult();
        result.setCourseInfoList(list);
        result.setTotal(solrDocumentList.getNumFound());
        return result;
    }
}
