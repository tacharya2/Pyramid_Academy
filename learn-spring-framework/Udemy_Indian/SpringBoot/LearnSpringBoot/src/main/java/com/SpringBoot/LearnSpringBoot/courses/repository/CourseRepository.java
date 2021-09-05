package com.SpringBoot.LearnSpringBoot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.LearnSpringBoot.courses.bean.Courses;

// Here we will play with a specific entity
// To accomplish this, we will extend JpaRepository  to this interface
// The JpaRepository require two type, the main Class (of the controller) and the data-type of the key
public interface CourseRepository extends JpaRepository<Courses, Long> {
	
}
