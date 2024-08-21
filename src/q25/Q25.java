package q25;

import Employee.Employee;


public class Q25 {

	public static void m1(Object o){
		//display employee data here
		
		System.out.println("Id:"+((Employee) o).getId()+"  Name:"+((Employee) o).getName() +"  Salary:"+((Employee) o).getSal());
	}
	public static void main(String[] args) {
		//create Employee object here with 101,sam,1000 data
		//call m1 method by passing this Employee object
		
		Employee e=new Employee(101,"sam",1200);
		Q25.m1(e);
	}



}
