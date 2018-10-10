package ua.logos.homework.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "persons")
public class Person extends BaseEntity{
	
	@Column(name = "first_name", length = 50, nullable = false)
	private String firstName;
	
	@Column(name = "last_name", length = 50, nullable = false)
	private String lastName;
	
	@Column(nullable = false)
	private int age;
	
	@Column(nullable = false, unique = true, length = 60)
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "work_id")
	private Work work;
	
	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;
	
	@OneToOne
	@JoinColumn(name = "person_details_id")
	private PersonDetails personDetails;
}
