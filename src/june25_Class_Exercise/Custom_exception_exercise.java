package june25_Class_Exercise;

import java.util.Scanner;
public class Custom_exception_exercise {
static void salary_checking(int salary_inside_method) throws salary_exception {
	if (salary_inside_method<2100) {
		throw new salary_exception("You need to work hard");		
	}else if (salary_inside_method>2101 && salary_inside_method<5000) {
		throw new salary_exception("Your salary is somehow good");
	}else if (salary_inside_method>5101 && salary_inside_method<9000) {
		throw new salary_exception("Your salary is very good");
	}
	
	
}
	public static void main(String[] args) {
		Scanner input_salary=new Scanner(System.in);
		System.out.println("Please enter the Salary");
		
		int salary=input_salary.nextInt();
		try {
			salary_checking(salary);
		}catch (Exception e) {
			System.out.println("Exception occured : "+e.getMessage());
		}

	}

}

class salary_exception extends Exception{
	salary_exception(String s){
		super(s);
	}
	
}
