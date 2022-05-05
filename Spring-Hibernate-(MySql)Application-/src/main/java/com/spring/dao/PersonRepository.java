package com.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Person;


public interface PersonRepository extends JpaRepository<Person, Integer> {
	//use for crud operation and it contain full api  CrudRepository and PagingAndSortingRepository
}
