package com.SpringBoot.LearnSpringBoot.courses.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// If you want to customize the variables with something different in the table;
// Do this: @Entity(name = "MyTable"), @Column(name = "Name"). Otherwise it will stay default
// by calss name or field name

@Entity(name = "MyTable")
public class Courses {
	@Id
	@GeneratedValue
	private long id;

	@Column(name = "Name")
	private String name;

	private String author;

	public Courses() {

	}

	/**
	 * @param id
	 * @param name
	 * @param author
	 */
	public Courses(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", author=" + author + ", name=" + name + "]";
	}
}
