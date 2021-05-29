package br.com.apimusicshool.apimusicshool.Model;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_group")
public class GroupStudentes {
	private @Id @GeneratedValue Integer id;
	@OneToMany
	private List<Student> students;
	@OneToOne
	private Course course;
	@OneToOne
	private Teacher teacher;


	public GroupStudentes() {
	}

	public GroupStudentes(Integer id, List<Student> students, Course course, Teacher teacher) {
		this.id = id;
		this.students = students;
		this.course = course;
		this.teacher = teacher;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Student> getStudents() {
		return this.students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public GroupStudentes id(Integer id) {
		setId(id);
		return this;
	}

	public GroupStudentes students(List<Student> students) {
		setStudents(students);
		return this;
	}

	public GroupStudentes course(Course course) {
		setCourse(course);
		return this;
	}

	public GroupStudentes teacher(Teacher teacher) {
		setTeacher(teacher);
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof GroupStudentes)) {
			return false;
		}
		GroupStudentes groupStudentes = (GroupStudentes) o;
		return Objects.equals(id, groupStudentes.id) && Objects.equals(students, groupStudentes.students) && Objects.equals(course, groupStudentes.course) && Objects.equals(teacher, groupStudentes.teacher);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, students, course, teacher);
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", students='" + getStudents() + "'" +
			", course='" + getCourse() + "'" +
			", teacher='" + getTeacher() + "'" +
			"}";
	}

}
