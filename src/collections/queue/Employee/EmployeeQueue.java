package collections.queue.Employee;

import java.util.ArrayDeque;
import java.util.Queue;

import listDemo.employees.Employee;

public class EmployeeQueue {

	public static void main(String[] args) {
		//Generating employee object
		Employee employee1 = new Employee(1001, "John Smith", 534564.546, "Engineering");
		Employee employee2 = new Employee(1002, "Marry Willian", 12536.546, "Engineering");
		Employee employee3 = new Employee(1003, "Ava Smith", 645865.546, "HR");
		Employee employee4 = new Employee(1004, "David Beckam", 23154.546, "HR");
		Employee employee5 = new Employee(1005, "Amar Singh", 5332164.546, "Engineering");
		
		Queue<Employee> queueOfEmployees = new ArrayDeque<Employee>();
		
		queueOfEmployees.add(employee1);
		queueOfEmployees.add(employee2);
		queueOfEmployees.add(employee3);
		queueOfEmployees.add(employee4);
		queueOfEmployees.add(employee5);
		
		//to find the peak? or peek or top or head element
				System.out.println("Head : "+queueOfEmployees.peek());
				System.out.println("Head : "+queueOfEmployees.element());
				System.out.println("---------------------------------");
				
				//To get all the element
				//Data of insertion is preserved
				System.out.println("All the employees: "+queueOfEmployees);
				System.out.println("---------------------------------");
				//remove and print head --> use poll()
				System.out.println("Removed element :"+queueOfEmployees.poll());
				System.out.println("Head now : "+queueOfEmployees.element());
				System.out.println("---------------------------------");
				
				//it is not thread safe
				//iterate over a queue
				for (String person :queueOfEmployees) {
					System.out.println("Name :"+person.name);
					System.out.println("Id :"+id);
					System.out.println("Salary :"+salary);
					System.out.println("Name :"+name);
					System.out.println("Name :"+name);
				}
				System.out.println("---------------------------------");
		

	}

}
