package com.car;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class studentsEntity {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
	private String std;
	private boolean gender;
	private int phonenumbre;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getPhonenumbre() {
		return phonenumbre;
	}
	public void setPhonenumbre(int phonenumbre) {
		this.phonenumbre = phonenumbre;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}


