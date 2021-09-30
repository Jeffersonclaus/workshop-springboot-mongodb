package com.clausweb.course.workshopmongodb.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.clausweb.course.workshopmongodb.domain.Post;
import com.clausweb.course.workshopmongodb.domain.User;
import com.clausweb.course.workshopmongodb.dto.AuthorDTO;
import com.clausweb.course.workshopmongodb.dto.ComentDTO;
import com.clausweb.course.workshopmongodb.repository.PostRepository;
import com.clausweb.course.workshopmongodb.repository.UserRepository;

@Configuration
public class Instalation implements CommandLineRunner {

@Autowired
UserRepository userRepository;

@Autowired
PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria,alex,bob));
		
		Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu Viagem", "Vou Viajar para São Paulo.Abraços!",new AuthorDTO( maria));
		Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia", "Acordei feliz hoje!", new AuthorDTO( maria));
		
		ComentDTO c1 = new ComentDTO("Boa viagem mano!", sdf.parse("21/03/2018"), new AuthorDTO(alex));
		ComentDTO c2 = new ComentDTO("Aproveite!", sdf.parse("22/03/2018"), new AuthorDTO(bob));
		ComentDTO c3 = new ComentDTO("Tenha um ótimo dia!", sdf.parse("23/03/2018"), new AuthorDTO(alex));
		
		
		post1.getComent().addAll(Arrays.asList(c1,c3));
		post2.getComent().addAll(Arrays.asList(c2));
		
		
		
		postRepository.saveAll(Arrays.asList(post1,post2));
		
		maria.getPost().addAll(Arrays.asList(post1,post2));
		
		
		
		
		
	}

}
