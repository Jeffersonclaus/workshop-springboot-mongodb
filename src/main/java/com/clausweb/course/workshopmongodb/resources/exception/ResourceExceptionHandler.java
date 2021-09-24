package com.clausweb.course.workshopmongodb.resources.exception;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.clausweb.course.workshopmongodb.services.exception.ObjectNotFounException;


@ControllerAdvice

public class ResourceExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFounException e, HttpServletRequest request){
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), status.value(), "Não encontrado", e.getMessage(), request.getRequestURI());
		return  ResponseEntity.status(status).body(err);
		
	}

	
	
	

}
