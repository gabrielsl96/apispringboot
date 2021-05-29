package br.com.apimusicshool.apimusicshool.Model;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	private @Id @GeneratedValue Integer id;
	private String name;
	@OneToMany
	private List<Course> courses;
	@OneToMany
	private List<Teacher> teachers;


	public Student() {
	}

	public Student(Integer id, String name, List<Course> courses, List<Teacher> teachers) {
		this.id = id;
		this.name = name;
		this.courses = courses;
		this.teachers = teachers;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourses() {
		return this.courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public List<Teacher> getTeachers() {
		return this.teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public Student id(Integer id) {
		setId(id);
		return this;
	}

	public Student name(String name) {
		setName(name);
		return this;
	}

	public Student courses(List<Course> courses) {
		setCourses(courses);
		return this;
	}

	public Student teachers(List<Teacher> teachers) {
		setTeachers(teachers);
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Student)) {
			return false;
		}
		Student student = (Student) o;
		return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(courses, student.courses) && Objects.equals(teachers, student.teachers);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, courses, teachers);
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", name='" + getName() + "'" +
			", courses='" + getCourses() + "'" +
			", teachers='" + getTeachers() + "'" +
			"}";
	}

}
