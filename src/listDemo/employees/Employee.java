package listDemo.employees;

public class Employee {
	public int id;
	public String name;
	public double salary;
	public String dept;
	
	public Employee() {};
	
	public Employee(int id,String name, double salary, String dept) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		
	}
//this is added to get the correct output in the employeelist.java
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}


}
