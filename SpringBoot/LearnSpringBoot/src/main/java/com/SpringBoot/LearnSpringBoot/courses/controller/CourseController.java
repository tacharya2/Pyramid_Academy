package com.SpringBoot.LearnSpringBoot.courses.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.LearnSpringBoot.courses.bean.Courses;
import com.SpringBoot.LearnSpringBoot.courses.repository.CourseRepository;

@RestController
public class CourseController {

	// Done this piece later to connect to the database to access it

	@Autowired
	// private JpaRepository<Courses, Long> repository;
	private CourseRepository repository;

	// When a user sends this request: http://localhost:8080/courses

	@GetMapping("/courses")


	public List<Courses> getAllCourses() {

		// Now instead of this we will retrieve out data from repository
//		return Arrays.asList(new Courses(1, "Learn MicroServices", "Tek Acharya"),
//				new Courses(2, "Learn Spring Boot", "Prajol Acharya"));
		return repository.findAll();
	}

	@GetMapping("/time")
	public String getCurrentTime() {
		return "The local time is of US EST: <br/>" + LocalDateTime.now().toString();
	}
// Cannot have two returns for the same page
//	@GetMapping("/time")
//	public String getCurrentTime2() {
//		return "The Current time shown is of US EST";
//	}

	@GetMapping("/courses/{id}")

	public Courses getOneCourse(@PathVariable long id) {
		Optional<Courses> thisCourse = repository.findById(id);
		if (thisCourse.isEmpty()) {
			throw new RuntimeException("This course does not exists!, try it again");
		}
		return thisCourse.get();
	}

	// In this case we need to accept a JSON file
	// Since we need to fetch the message with an API call we need the annotation of
	// a message body as
	// @RequestBody and map it to the Courses variable course.
	// The way you can save that course entity is to use reposite.save(course);

	// It seems that creating post is easy but executing it is difficult as we will
	// explore below.

	// POST
	@PostMapping("/courses")
	public void createCourse(@RequestBody Courses course) {
		repository.save(course);
	}

	// PUT (update)
	// PUT is very close to POST as it only has to do with the existing (id) then to
	// create a id-less entry.

	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id, @RequestBody Courses course) {
		repository.save(course);
	}

	// DELETE
	// Pretty same as PUT method again

	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable long id) {

		repository.deleteById(id);
	}
}
