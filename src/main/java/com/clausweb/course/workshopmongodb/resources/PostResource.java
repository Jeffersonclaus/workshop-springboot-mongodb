package com.clausweb.course.workshopmongodb.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

/*	@Autowired
	PostService postService;

	
	//findAll()
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<UserDTO>> Findall() {

		List<User> list = service.findAll();
		List<UserDTO> listDTO = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());

		return ResponseEntity.ok().body(listDTO);

	}

	//findById()
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<UserDTO> findById(@PathVariable String id) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(new UserDTO(obj));
	}

	//Insert()
	@PostMapping
	public ResponseEntity<Void> Insert(@RequestBody UserDTO objDTO) {
		User obj = service.fromDTO(objDTO);

		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	//delete()
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable String id) {

		service.delete(id);
		return ResponseEntity.noContent().build();

	}

	//update()
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
 	public ResponseEntity<Void> update(@RequestBody UserDTO objDto, @PathVariable String id) {
		User obj = service.fromDTO(objDto);
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}*/
}
