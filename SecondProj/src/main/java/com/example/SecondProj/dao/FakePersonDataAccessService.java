package com.example.SecondProj.dao;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.example.SecondProj.model.Person;

@Repository
//@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao{
	
	private static List<Person> DB = new ArrayList<>();

	@Override
	public int insertPerson(UUID id, Person person) {
		DB.add(new Person(id, person.getName()));
		return 1;
	}
}
