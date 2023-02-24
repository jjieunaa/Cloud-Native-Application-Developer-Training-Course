package kr.kwangan2.rest.person.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.kwangan2.rest.person.domain.Person;
import kr.kwangan2.rest.person.service.PersonService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping(value="/person", method=RequestMethod.GET)
@Log4j
@AllArgsConstructor
public class PersonController {
	
	private PersonService personService;
	
	@GetMapping(value="")
	public List<Person> listPerson() {	
		return personService.listPerson();
	}
	
	/*
	@GetMapping(value="/{pid}")
	public Person selectPerson(@PathVariable("pid") long pid) {
		return personService.selectPerson(pid);
	}
	*/
	
	/*
	@PostMapping(value="/insert")
	public int insertPerson() {
		Person person = new Person();
		
		person.setPname("pname");
		person.setPage("20");
		
		return personService.insertPerson(person);
	}	
	*/
	
	
	@PutMapping(value="/{pid}")
	public int updatePerson(@PathVariable("pid") long pid) {
		Person person = new Person();
		
		person.setPid(pid);
		person.setPname("update pname");
		person.setPage("30");
		
		return personService.updatePerson(person);
	}
	
	
	/*
	@DeleteMapping(value="/{pid}")
	public int deletePerson(@PathVariable("pid") long pid) {
		return personService.deletePerson(pid);
	}
	*/
		
}
