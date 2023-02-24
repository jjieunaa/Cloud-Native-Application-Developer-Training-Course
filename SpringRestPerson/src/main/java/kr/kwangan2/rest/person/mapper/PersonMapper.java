package kr.kwangan2.rest.person.mapper;

import java.util.List;

import kr.kwangan2.rest.person.domain.Person;

public interface PersonMapper {
	
	public List<Person> listPerson();
	
	public Person selectPerson(Long pid);
	
	public int insertPerson(Person person);
	
	public int updatePerson(Person person);
	
	public int deletePerson(Long pid);

}
