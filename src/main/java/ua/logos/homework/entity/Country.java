package ua.logos.homework.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country extends BaseEntity{
	
	@Column(name = "name_country")
	String nameCountry;
	
	@ManyToMany(mappedBy = "countries")
	List<Company> companies;

}
