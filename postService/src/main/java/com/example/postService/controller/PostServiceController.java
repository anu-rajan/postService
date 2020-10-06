package com.example.postService.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.postService.model.Person;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Api(value = "PostServiceController", description = "REST Apis related to Student Entity!!!!")
@RestController
public class PostServiceController {

	Logger logger = Logger.getLogger(PostServiceController.class.getName());	
	
	@ApiOperation(value = "Get full name of a person ", response = String.class, tags = "getFullName")
	@RequestMapping(value= "/fullName", method = RequestMethod.POST, consumes="application/json")
	public ResponseEntity<String> createFullName(@RequestBody Person person) {
			logger.log(Level.INFO, "postService -- getFullName");
			ResponseEntity<String> response = new ResponseEntity<String>(person.getName() +" "+ person.getSurName(), HttpStatus.OK);
			return response;
	}

}
