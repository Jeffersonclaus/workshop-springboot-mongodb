package com.clausweb.course.workshopmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clausweb.course.workshopmongodb.domain.User;
import com.clausweb.course.workshopmongodb.repository.UserRepository;
import com.clausweb.course.workshopmongodb.services.exception.ObjectNotFounException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		
		return repo.findAll();
	}


		
		public User findById(String id) {
			Optional<User> obj = repo.findById(id);
			return obj.orElseThrow(() -> new ObjectNotFounException("Objeto não encontrado"));
		}
		
		
	
	

	
	
	
}
