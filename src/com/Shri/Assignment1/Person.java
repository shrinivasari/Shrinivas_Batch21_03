package com.Shri.Assignment1;

public class Person {
	private int age;
	  private String Name,Address;
	public Person(int age, String name, String address) {
		
		this.age = age;
		this.Name = name;
		this.Address = address;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}


	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", Name=" + Name + ", Address=" + Address + "]";
	}
}
