package ua.logos.homework.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "person_details")
public class PersonDetails extends BaseEntity{
	
	@Column(name = "father_name", length = 80)
	private String fatherName;
	
	@Column(name = "mother_name", length = 80)
	private String motherName;
	
	@Column(length = 40, nullable = false)
	private String hobby;
	
	@Column(length = 50, nullable = false)
	private String home;
	
	@OneToOne
	@JoinColumn(name = "person_id")
	private Person person;

}
