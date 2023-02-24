package kr.kwangan2.rest.person.service;

import java.util.List;

import kr.kwangan2.rest.person.domain.Person;

public interface PersonService {
	
	public List<Person> listPerson();
	
	public Person selectPerson(Long pid);
	
	public int insertPerson(Person person);
	
	public int updatePerson(Person person);
	
	public int deletePerson(Long pid);
	
}
