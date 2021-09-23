package com.clausweb.course.workshopmongodb.resources;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.config.YamlProcessor.ResolutionMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clausweb.course.workshopmongodb.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> Findall() {

		User maria = new User("1", "Maria Silva", "maria@gmail.com");
		User alex = new User("2", "Alex Brow", "alexBrow@gmail.com");
		List<User> list = new ArrayList<>();
		list.add(maria);
		list.add(alex);

		return ResponseEntity.ok().body(list);

	}

}
