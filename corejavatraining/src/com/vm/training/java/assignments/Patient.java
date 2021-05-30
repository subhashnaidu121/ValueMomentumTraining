package com.vm.training.java.assignments;

public class Patient {

	private int patientid;
	private String name;
	private int age;
	public Patient(int patientid, String name, int age) {
		super();
		this.patientid = patientid;
		this.name = name;
		this.age = age;
	}
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patient [patientid=" + patientid + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
