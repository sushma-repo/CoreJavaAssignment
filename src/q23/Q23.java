package q23;

import Employee.Employee;

public class Q23 {

	public static void m1(Object o){
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		//call m1 method from here
		
		Employee e = new Employee();
		
		Q23.m1(e);
	}


}
