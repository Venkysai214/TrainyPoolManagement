package com.nt.dto;

import java.io.Serializable;
import java.util.Date;

public class TrainerManagementDTO implements Serializable{
	private long trainerNo;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private Long contactNo;
	private String userId;
	private String password;
	public long getTrainerNo() {
		return trainerNo;
	}
	public void setTrainerNo(long trainerNo) {
		this.trainerNo = trainerNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
