package com.example.SecondProj.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.SecondProj.dao.PersonDao;
import com.example.SecondProj.model.Person;

@Service
public class PersonService {
	
	@Autowired
	private PersonDao personDao;
	
//	@Autowired
//	public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
//		this.personDao = personDao;
//	}
	
//	@Autowired
//	public PersonService(PersonDao personDao) {
//		this.personDao = personDao;
//	}

	public int addPerson(Person person) {
		return personDao.insertPerson(person);
	}
	
	public List<Person> getAllPeople(){
		return personDao.selectAllPeople();
	}
	
	public Optional<Person> getPersonById(UUID id){
		return personDao.selectPersonById(id);
	}
	
	public int deletePersonById(UUID id) {
		return personDao.deletePersonById(id);
	}
	
	public int updatePersonById(UUID id, Person person) {
		return personDao.updatePersonById(id, person);
	}
}
