package com.exercise.filteringmatches.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercise.filteringmatches.domain.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>, PersonRepositoryCustom {
}
