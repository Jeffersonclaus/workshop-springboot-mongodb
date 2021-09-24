package com.clausweb.course.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.clausweb.course.workshopmongodb.domain.User;

@Repository

public interface UserRepository extends MongoRepository<User, String> {

	
	
	
	

}
