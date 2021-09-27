package com.clausweb.course.workshopmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clausweb.course.workshopmongodb.UserDTO.UserDTO;
import com.clausweb.course.workshopmongodb.domain.User;
import com.clausweb.course.workshopmongodb.repository.UserRepository;
import com.clausweb.course.workshopmongodb.services.exception.ObjectNotFounException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {

		return repo.findAll();
	}

	public Optional <User> findById(String id) {
		Optional<User> user = repo.findById(id);
		if (user == null) {
			throw new ObjectNotFounException("Objeto não encontrado");
		}
		return user;
	}

	public User insert(User obj) {

		return repo.insert(obj);

	}

	public void delete(String id) {
		findById(id);	
		repo.deleteById(id);
	
	}

	
	
	
	
	
	
	
	public User fromDTO(UserDTO objDto) {

		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());

	}

	

}
