package q30;

import Employee.Employee;

public class Q30 {

	public static Employee m1(){
		//create Employee object here and return
		//do required changes in m1 method to do this task	
		Employee emp= new Employee(101,"Sam",2000);			
		return emp;
		
		
	}


	public static void main(String[] args) {
		//call m1 method and catch returned employee object here
		//display returned employee data here
		
		Employee emp=Q30.m1();	
		System.out.println("Id:"+emp.getId()+"  Name:"+emp.getName() +"  Salary:"+emp.getSal());
	}


}
