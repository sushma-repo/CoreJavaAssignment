package q34;

import java.util.Scanner;

import Employee.Employee;

public class Q34 {

	public static void main(String[] args) {
		//take data id,name,salary from user using scanner and display that data in show method
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Id of an Employee");
		int id =sc.nextInt();
		
		System.out.println("Enter the name of an Employee");
		String name =sc.next();
		
		System.out.println("Enter the sal of an Employee");
		int sal=sc.nextInt();
		
		
		Employee e=new Employee();
		e.setId(id);
		e.setName(name);
		e.setSal(sal);
		
		
		Q34 q=new Q34();
		q.show(e);
	}

	public void show(Employee emp){
		//display data here by doing required changes
		
		System.out.println("Id:"+emp.getId()+"  Name:"+emp.getName() +"  Salary:"+emp.getSal());
	}


}
