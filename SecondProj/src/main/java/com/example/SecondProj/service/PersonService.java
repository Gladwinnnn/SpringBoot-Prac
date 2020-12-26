package com.example.SecondProj.service;

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
}
