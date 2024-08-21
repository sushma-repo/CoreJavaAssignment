package q24;

import Employee.Employee;

public class Q24 {

	public static void m1(Employee emp){
		System.out.println("Id:"+emp.getId()+"  Name:"+emp.getName() +"  Salary:"+emp.getSal());
	}
	public static void main(String[] args) {
		//call m1 method from here
		
		Employee e=new Employee(101,"sam",1200);
		Q24.m1(e);
	}


}
