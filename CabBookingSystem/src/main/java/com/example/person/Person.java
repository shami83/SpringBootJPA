package com.example.person;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;	
	private String name;
	private String country;
	private String gender;
	
	@OneToMany(mappedBy="person",targetEntity=Hobby.class,
		       fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	List<Hobby> hobby;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public List<Hobby> getHobby() {
		return hobby;
	}
	public void setHobby(List<Hobby> hobby) {
		this.hobby = hobby;
	}
	
	public void addHobby(Hobby ihobby)
	{
		if(hobby == null)
		{
			hobby = new ArrayList<Hobby>();
		}
		hobby.add(ihobby);
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", country=" + country + ", gender=" + gender + "]";
	}
	
	

}
