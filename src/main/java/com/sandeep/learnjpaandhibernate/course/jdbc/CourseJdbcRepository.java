package com.sandeep.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sandeep.learnjpaandhibernate.course.Course;

@Repository
public class CourseJdbcRepository {
	@Autowired
	private JdbcTemplate repository;
	String insertQuery=
			"""
				INSERT INTO COURSE
				VALUES(?,?,?);
			""";
	String deleteQuery=
			"""
				DELETE FROM COURSE
				WHERE id=?;
			""";
	String selectQuery=
			"""
				SELECT * FROM COURSE
				WHERE id=?;
			""";
	public void insert(Course course) {
		
		repository.update(insertQuery,
					course.getId(),course.getName(),course.getAuthor());
	}
	
	public void delete(int id) {
		
		repository.update(deleteQuery,id);
	}
	public Course findById(int id) {
		return repository.queryForObject(selectQuery,
					new BeanPropertyRowMapper<>(Course.class),id);
	}
	
	
	
}
