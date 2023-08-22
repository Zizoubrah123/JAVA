package com.human.javaExam.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.human.javaExam.models.YogaCourse;

public interface CourseRepository extends CrudRepository<YogaCourse, Long> {

	List<YogaCourse> findAll();
	
}
