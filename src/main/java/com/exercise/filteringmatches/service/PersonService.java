package com.exercise.filteringmatches.service;

import java.util.List;

import com.exercise.filteringmatches.domain.Person;
import com.exercise.filteringmatches.dto.FilterDTO;

public interface PersonService {

	public Person getLoggedInPerson();

	public List<Person> list(FilterDTO filter);
}
