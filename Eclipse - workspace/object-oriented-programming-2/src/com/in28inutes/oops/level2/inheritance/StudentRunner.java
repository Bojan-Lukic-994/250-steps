package com.in28inutes.oops.level2.inheritance;

public class StudentRunner {


	public static void main(String[] args) {

		// Student student = new Student();
		// student.setName("Ranga");
		// student.setEmail("in28minutes@gmail.com");

		/*
		Person person = new Person();
		person.setName("Bojan");
		person.setEmail("in28minutes.com");
		person.setPhoneNumber("15357");
		String value = person.toString();
		System.out.println(value);
		System.out.println(person);
	    */
	
		Employee employee = new Employee("Bojan", "Chef");
		// employee.setName("Bojan");
		employee.setEmail("in28minutes.com");
		employee.setPhoneNumber("15357");
		employee.setTitle("Chef");
		employee.setEmployerName("Bojan");
		employee.setEmployeeGrade('B');
		// employee.setSalary();
		
		System.out.println(employee);
	}

}
