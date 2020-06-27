package com.javi.hibernate.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	
	// define our fields
	
	private int id;
	
	private String title;
	
	private Instructor instructor;
	
	// define constructors
	
	public Course() {
		
	}

	public Course(String title) {
		this.title = title;
	}

	
	// define getters and setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	
	// define toString
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + "]";
	}
	
	
	// annotate fields
	
	

}
