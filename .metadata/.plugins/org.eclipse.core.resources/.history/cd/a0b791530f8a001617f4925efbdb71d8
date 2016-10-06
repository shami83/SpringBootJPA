package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.person.Person;

@Repository
public interface PersonRepositary extends CrudRepository<Person, Long>,QueryDslPredicateExecutor<Person> {
	
	@Query("select p from Person p where p.country like ?1")
	List<Person> findByCountryContains(String country);
	
	List<Person> findPersonByHobbyName(String name);
	

}
