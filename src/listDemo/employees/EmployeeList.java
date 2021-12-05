package listDemo.employees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		// Create multiple employee object
		
		Employee employee1 = new Employee(1001, "John Smith", 534564.546, "Engineering");
		Employee employee2 = new Employee(1002, "Marry Willian", 12536.546, "Engineering");
		Employee employee3 = new Employee(1003, "Ava Smith", 645865.546, "HR");
		Employee employee4 = new Employee(1004, "David Beckam", 23154.546, "HR");
		Employee employee5 = new Employee(1005, "Amar Singh", 5332164.546, "Engineering");
		
		//create a employee list
		//List<Employee> employeesList = new ArrayList<Employee>();
		List<Employee> employeesList = new LinkedList<Employee>();
		
		//add employee to list
		employeesList.add(employee1);
		employeesList.add(employee2);
		employeesList.add(employee3);
		employeesList.add(employee2);
	
		//add employee at index
		employeesList.add(0,employee5); //adding employee 5 at the first index
		
		//replace employee at a certain index
		employeesList.set(2, employee4);
		
		
		System.out.println("employeeslist :"+employeesList); //this will give the reference of the objects
		//this is changed if we have the override method in the employee.java
		
		for (Employee employee :employeesList) {
			System.out.println(employee);
			System.out.println("------------------------------");
			System.out.println("Employee Id : "+employee.id);
			System.out.println("Employee Name : "+employee.name);
			System.out.println("Employee Dept : "+employee.dept);
			System.out.println("Employee Salary : "+employee.salary);
		}
		
		
		

	}

}
