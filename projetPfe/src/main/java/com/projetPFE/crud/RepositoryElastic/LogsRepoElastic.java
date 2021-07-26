package com.projetPFE.crud.RepositoryElastic;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.projetPFE.crud.model.LogsModel;
@Repository
public interface LogsRepoElastic extends ElasticsearchRepository<LogsModel, Integer> {
	public boolean existsByTYPE(String TYPE);
	public boolean existsById(int id);
}
