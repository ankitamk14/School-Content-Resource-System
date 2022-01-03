package com.adminportal.repository;

import org.springframework.data.repository.CrudRepository;

import com.adminportal.content.ArticleExternal;

public interface JmolPropertyRepository extends CrudRepository<ArticleExternal, Integer>{
	
}
