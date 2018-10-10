package ua.logos.homework.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "company")
public class Company extends BaseEntity {

	@Column(name = "name_company", length = 55, nullable = false, unique = true)
	private String nameCompany;
	
	@Column(nullable = false)
	private int workers;
	
	@OneToMany(mappedBy = "company")
	private List<Person> persons;

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

	public void setWorkers(int workers) {
		this.workers = workers;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	
	

}
