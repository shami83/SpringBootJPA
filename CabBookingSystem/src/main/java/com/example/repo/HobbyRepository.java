package com.example.repo;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import com.example.person.Hobby;

public interface HobbyRepository extends CrudRepository<Hobby,Long>,QueryDslPredicateExecutor<Hobby>  {

}