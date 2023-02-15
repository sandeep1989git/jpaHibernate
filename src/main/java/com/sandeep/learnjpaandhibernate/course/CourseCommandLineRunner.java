package com.sandeep.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sandeep.learnjpaandhibernate.course.springDataJpa.SpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	/*
	 * @Autowired private CourseJdbcRepository courseJdbcRepository;
	 */
	/*
	 * @Autowired private JpaRepository jpaRepository;
	 */
	
	@Autowired
	private SpringDataJpaRepository repository;
	
	
	


	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Course(1,"Learn Java","Auh1"));
		repository.save(new Course(2,"Learn Python","Auh2"));
		repository.save(new Course(3,"Learn php","Auh3"));
		repository.save(new Course(4,"Learn c++","Auh4"));
		repository.deleteById(1l);
		System.out.println(repository.findById(2l));
		System.out.println("Find by Author: "+repository.findByAuthor("Auh3"));
		System.out.println("Find by Course: "+ repository.findByName("Learn c++"));
		
	}
	
}
