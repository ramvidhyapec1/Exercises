package com.simplilearn.arrays;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import listDemo.employees.Employee;

public class EmployeeSet {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1001, "John Smith", 534564.546, "Engineering");
		Employee employee2 = new Employee(1002, "Marry Willian", 12536.546, "Engineering");
		Employee employee3 = new Employee(1003, "Ava Smith", 645865.546, "HR");
		Employee employee4 = new Employee(1004, "David Beckam", 23154.546, "HR");
		Employee employee5 = new Employee(1005, "Amar Singh", 5332164.546, "Engineering");
		
		//Create a set of employees
		Set<Employee> setOfEmployees = new LinkedHashSet<Employee>();
		
		setOfEmployees.add(employee1);
		setOfEmployees.add(employee2);
		setOfEmployees.add(employee3);
		setOfEmployees.add(employee4);
		setOfEmployees.add(employee5);
		setOfEmployees.add(employee1);
		
		System.out.println(setOfEmployees);
		for (Employee emp :setOfEmployees) {
			System.out.println(emp);
			System.out.println("------------------------------");
			System.out.println("Employee Id : "+emp.id);
			System.out.println("Employee Name : "+emp.name);
			System.out.println("Employee Dept : "+emp.dept);
			System.out.println("Employee Salary : "+emp.salary);
	}

}
}