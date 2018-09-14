package com.bufs.catbot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class MongoPersistence {

	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	
	public void getAnyway() {
		
	
		Criteria criteria = new Criteria("name").is("냥냥봇");
		
		Query query = new Query(criteria);
		MongoDTO result = mongoTemplate.findOne(query, MongoDTO.class, "catDb");
		System.out.println("get Result... " + result);
		
		
	}
	
}
