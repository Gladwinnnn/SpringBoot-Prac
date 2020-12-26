package com.example.SecondProj.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SecondProj.model.Person;
import com.example.SecondProj.service.PersonService;

@RequestMapping
@RestController
public class PersonController {
	@Autowired
	private PersonService personService;
	
//	@Autowired
//	public PersonController(PersonService personService) {
//		this.personService = personService;
//	}
	
	@PostMapping("/addperson")
	public void addPerson(@RequestBody Person person) {
		personService.addPerson(person);
	}
	
}
