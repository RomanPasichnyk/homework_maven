package ua.logos.homework.entity;

import java.math.BigDecimal;
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
@Table(name = "works")
public class Work extends BaseEntity {
	
	@Column(name = "work_name", length = 120, nullable = false, unique = true)
	private String workName;
	
//	@Column(columnDefinition = "Decimal(5,2)", nullable = true)
	@Column(columnDefinition = "INT", nullable = true)
	private int salary;
	
	@OneToMany(mappedBy = "work")
	private List<Person> persons;	

}
