package com.clausweb.course.workshopmongodb.services;

import java.util.Date;
import java.util.List;
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
	
	public List<Post> findByTitle(String text) {
		return repo.searchTitle(text);
	}

	public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
		maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000); // add mais 1 hora em milisegundos
		return repo.fullSearch(text, minDate, maxDate);
	}
	
	
}
