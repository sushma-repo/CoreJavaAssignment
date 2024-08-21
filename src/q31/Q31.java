package q31;

import Employee.Employee;

public class Q31 {

	public static Object m1(){
		//create Employee object here and return
		//don’t change m1 method prototype i.e return type or access specifier
		Employee emp= new Employee(101,"Sam",2000);	
		
		return emp;
		
	}
	public static void main(String[] args) {
		//call m1 method and catch returned employee object here
		//display returned employee data here
		
		Employee emp=(Employee) Q31.m1();	
		System.out.println("Id:"+emp.getId()+"  Name:"+emp.getName() +"  Salary:"+emp.getSal());
	}


}
