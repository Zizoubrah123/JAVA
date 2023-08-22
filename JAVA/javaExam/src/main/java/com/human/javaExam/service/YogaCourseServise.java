package com.human.javaExam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.javaExam.models.YogaCourse;
import com.human.javaExam.repository.CourseRepository;

@Service
public class YogaCourseServise {

	@Autowired
	private CourseRepository courseRepo;

	// returns all the books
	public List<YogaCourse> allCourses() {
		return courseRepo.findAll();
	}

	// creates a course
	public YogaCourse createCourse(YogaCourse b) {
		return courseRepo.save(b);
	}

	// retrieves a course
	public YogaCourse findCourse(Long id) {
		Optional<YogaCourse> optionalCourse = courseRepo.findById(id);
		if (optionalCourse.isPresent()) {
			return optionalCourse.get();
		} else {
			return null;
		}
	}

	// UPDATE
	public YogaCourse updateCourse(YogaCourse b) {
		return courseRepo.save(b);
	}

	// DELETE
	public void deleteCourse(Long id) {
		courseRepo.deleteById(id);
	}
}
