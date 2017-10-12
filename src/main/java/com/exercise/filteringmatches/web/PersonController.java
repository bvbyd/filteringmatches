package com.exercise.filteringmatches.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.filteringmatches.domain.Person;
import com.exercise.filteringmatches.dto.FilterDTO;
import com.exercise.filteringmatches.service.PersonService;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

	@Autowired
	private PersonService personService;

	@GetMapping
	public List<Person> list(FilterDTO filter) {
		filter.setPerson(personService.getLoggedInPerson());
		return personService.list(filter);
	}

}
