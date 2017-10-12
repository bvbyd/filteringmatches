package com.exercise.filteringmatches.repository;

import java.util.List;

import com.exercise.filteringmatches.domain.Person;
import com.exercise.filteringmatches.dto.FilterDTO;

public interface PersonRepositoryCustom {

	public List<Person> findPersonsByFilter(FilterDTO filter);
}
