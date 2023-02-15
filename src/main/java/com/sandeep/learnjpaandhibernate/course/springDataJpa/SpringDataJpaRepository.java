package com.sandeep.learnjpaandhibernate.course.springDataJpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandeep.learnjpaandhibernate.course.Course;

public interface SpringDataJpaRepository extends JpaRepository<Course, Long>{

	List<Course> findByAuthor(String string);

	List<Course> findByName(String string);
	
	
}
	


