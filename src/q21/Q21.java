package q21;

import Employee.Employee;

public class Q21 {

	public static void m1(Employee e){
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		//call m1 method from here
		
		Employee e =new Employee();
		Q21.m1(e);
	}

}
