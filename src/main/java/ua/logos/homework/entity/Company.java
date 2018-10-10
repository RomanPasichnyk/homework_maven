package ua.logos.homework.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company extends BaseEntity {

	@Column(name = "name_company", length = 55, nullable = false, unique = true)
	private String nameCompany;
	
	@Column(nullable = false)
	private int workers;
	
	@OneToMany(mappedBy = "company")
	private List<Person> persons;

}
