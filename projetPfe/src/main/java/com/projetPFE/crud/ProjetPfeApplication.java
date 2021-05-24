package com.projetPFE.crud;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@EntityScan(basePackages = "com.projetPFE.crud.entity")

@SpringBootApplication
@ComponentScan
public class ProjetPfeApplication {

    //private static final Logger logger = LogManager.getLogger(ProjetPfeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProjetPfeApplication.class, args);
		
	}
	/*public void run(ApplicationArguments applicationArguments) throws Exception {
        logger.debug("Debugging log");
        logger.info("Info log");
        logger.warn("Hey, This is a warning!");
        logger.error("Oops! We have an Error. OK");
        logger.fatal("Damn! Fatal error. Please fix me.");
    }*/

	@Bean
	public boolean createTestIndex(RestHighLevelClient restHighLevelClient) throws Exception {
		try {
			DeleteIndexRequest deleteIndexRequest = new DeleteIndexRequest("projet-pfe");
			restHighLevelClient.indices().delete(deleteIndexRequest, RequestOptions.DEFAULT); // 1
		} catch (Exception ignored) {
		}

		CreateIndexRequest createIndexRequest = new CreateIndexRequest("projet-pfe");
		createIndexRequest.settings(
				Settings.builder().put("index.number_of_shards", 1)
						.put("index.number_of_replicas", 0));
		restHighLevelClient.indices().create(createIndexRequest, RequestOptions.DEFAULT); // 2

		return true;
	}


}
		
		/*RestHighLevelClient client = new RestHighLevelClient(
				RestClient.builder(new HttpHost("localhost", 9200, "http")));
		
		
		
		
		SearchRequest searchRequest = new SearchRequest();
	    searchRequest.indices("tesla_employees");
	    SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
	    searchSourceBuilder.query(QueryBuilders.matchAllQuery());
	    searchRequest.source(searchSourceBuilder);
	    Map<String, Object> map=null;
	     
	    try {
	        SearchResponse searchResponse = null;
	        searchResponse =client.search(searchRequest, RequestOptions.DEFAULT);
	        if (searchResponse.getHits().getTotalHits().value > 0) {
	            SearchHit[] searchHit = searchResponse.getHits().getHits();
	            for (SearchHit hit : searchHit) {
	                map = hit.getSourceAsMap();
	                  System.out.println("map:"+Arrays.toString(map.entrySet().toArray()));
	                    
	                
	            }
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		
		
	}*/


