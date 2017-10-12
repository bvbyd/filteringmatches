package com.exercise.filteringmatches.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.exercise.filteringmatches.domain.Person;
import com.exercise.filteringmatches.dto.FilterDTO;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PersonRepositoryTest {

	@Autowired
	private PersonRepository personRepository;

	@Test
	public void testCount() throws Exception {
		long c = personRepository.count();
		assertThat(c).isEqualTo(25);
	}

	@Test
	public void testFindOne() throws Exception {
		Person p = personRepository.findOne(1l);
		assertThat(p.getDisplayName()).isEqualTo("Caroline");
	}

	@Test
	public void testFilter() throws Exception {
		FilterDTO filter = new FilterDTO();
		filter.setAgeFrom(35);
		filter.setAgeFrom(47);
		filter.setCompatibilityFrom(87);
		filter.setHeightTo(165);
		filter.setDistance(100);
		filter.setPerson(personRepository.getOne(1l));

		List<Person> persons = personRepository.findPersonsByFilter(filter);
		assertThat(persons).hasSize(1);
	}

}
