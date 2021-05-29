package br.com.apimusicshool.apimusicshool.Model;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher {
	private @Id @GeneratedValue Integer id;
	private String name;
	private String email;
	@OneToMany
	private List<Course> especialties;
	private Boolean active;

	public Teacher() {
	}

	public Teacher(Integer id, String name, String email, List<Course> especialties) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.especialties = especialties;
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Course> getEspecialties() {
		return this.especialties;
	}

	public void setEspecialties(List<Course> especialties) {
		this.especialties = especialties;
	}

	public Teacher id(Integer id) {
		setId(id);
		return this;
	}

	public Teacher name(String name) {
		setName(name);
		return this;
	}

	public Teacher email(String email) {
		setEmail(email);
		return this;
	}

	public Teacher especialties(List<Course> especialties) {
		setEspecialties(especialties);
		return this;
	}

	public Boolean isActive() {
		return this.active;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Teacher)) {
			return false;
		}
		Teacher teacher = (Teacher) o;
		return Objects.equals(id, teacher.id) && Objects.equals(name, teacher.name) && Objects.equals(email, teacher.email) && Objects.equals(especialties, teacher.especialties);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, email, especialties);
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", name='" + getName() + "'" +
			", email='" + getEmail() + "'" +
			", especialties='" + getEspecialties() + "'" +
			"}";
	}

}
