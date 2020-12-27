package com.example.SecondProj.api;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/getallpeople")
	public List<Person> getAllPeople(){
		return personService.getAllPeople();
	}
	
	@GetMapping("/getpersonbyid/{id}")
	public Person getPersonById(@PathVariable("id") UUID id) {
		return personService.getPersonById(id).orElse(null);
	}
	
	@DeleteMapping("deletepersonbyid/{id}")
	public void deletePerson(@PathVariable("id") UUID id) {
		personService.deletePersonById(id);
	}
	
	@PutMapping("updatepersonbyid/{id}")
	public void updatePerson(@PathVariable("id") UUID id, @RequestBody Person person) {
		personService.updatePersonById(id, person);
	}
}
