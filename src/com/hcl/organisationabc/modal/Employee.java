package com.hcl.organisationabc.modal;

public class Employee {
	
	private static int count=0;
	private int id;
	private String name;
	private int age;
	private int salary; // per annum
	private String department;
	private String city;
	
	public Employee(){
	count++;
	setId(count);
	}
	
	public Employee(String name) {
		super();
		count++;
		setId(count);
		this.name = name;

	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", department="
				+ department + ", city=" + city + "]";
	}

}
