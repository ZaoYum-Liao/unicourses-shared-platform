package com.ourTeam.search;


import org.apache.solr.client.solrj.SolrQuery;

/**
 * @author hcoly1
 * @create 2019-03-12-10:20
 */
public interface SearchDao {

    SearchResult search(SolrQuery query) throws Exception;
}
