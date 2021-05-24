package com.projetPFE.crud.elasticController;



/*import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.IndexedObjectInformation;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.stereotype.Service;

import com.projetPFE.crud.entity.DataDestination;

   
   
   
   
   
public class DataSourceSearchService {
	
	

	  private static final String DataDestination_INDEX = "datadestinationindex";
	 
	  private ElasticsearchOperations elasticsearchOperations;

	  /*public List<IndexedObjectInformation> createDataDestinationIndexBulk
	            (final List<DataDestination> datas) {

	      DataDestination product;
		List<IndexQuery> queries = datas.stream()
	      .map(data -> new IndexQueryBuilder()
	        .withId(product.getIdDestination().toString())
	        .withObject(product).build())
	      .collect(Collectors.toList());;
	    
	      return elasticsearchOperations
	      .bulkIndex(queries,IndexCoordinates.of(DataDestination_INDEX));
	  }*/

	  
	  /*public String createDataDestinationIndex(DataDestination product) {

		    IndexQuery indexQuery = new IndexQueryBuilder()
		         .withId(product.getIdDestination())
		         .withObject(product).build();

		    String documentId = elasticsearchOperations
		     .index(indexQuery, IndexCoordinates.of(DataDestination_INDEX));

		    return documentId;
		  }*/
	  
	  

