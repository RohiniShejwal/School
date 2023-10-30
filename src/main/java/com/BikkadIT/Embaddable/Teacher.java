package com.BikkadIT.Embaddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Embeddable
@Table(name="Teacher_Details")
public class Teacher {

	@Column(name="Teacher_id")
	private int id;
	@Column(name="Teacher_name")
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
