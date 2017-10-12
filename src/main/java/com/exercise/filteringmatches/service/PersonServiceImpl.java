package com.exercise.filteringmatches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.filteringmatches.domain.Person;
import com.exercise.filteringmatches.dto.FilterDTO;
import com.exercise.filteringmatches.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public Person getLoggedInPerson() {
		return personRepository.getOne(1l);
	}

	@Override
	public List<Person> list(FilterDTO filter) {
		return personRepository.findPersonsByFilter(filter);
	}

}
