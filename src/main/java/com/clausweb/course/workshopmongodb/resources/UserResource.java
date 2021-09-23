package com.clausweb.course.workshopmongodb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clausweb.course.workshopmongodb.domain.User;
import com.clausweb.course.workshopmongodb.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	
	@Autowired
	UserService service;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> Findall() {

		List<User> list = service.findAll();
		
		return ResponseEntity.ok().body(list);

	}

}