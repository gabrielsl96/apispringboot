package br.com.apimusicshool.apimusicshool.Model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	private @Id @GeneratedValue Integer id;
	private String name;


	public Course() {
	}

	public Course(Integer id, String name) {
		this.id = id;
		this.name = name;
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

	public Course id(Integer id) {
		setId(id);
		return this;
	}

	public Course name(String name) {
		setName(name);
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Course)) {
			return false;
		}
		Course course = (Course) o;
		return Objects.equals(id, course.id) && Objects.equals(name, course.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", course='" + getName() + "'" +
			"}";
	}

}
