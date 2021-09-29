package com.clausweb.course.workshopmongodb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clausweb.course.workshopmongodb.domain.Post;
import com.clausweb.course.workshopmongodb.repository.PostRepository;
import com.clausweb.course.workshopmongodb.services.exception.ObjectNotFounException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFounException("Objeto não encontrado"));
	}
	
	


}
