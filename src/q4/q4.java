package q4;

import Employee.Employee;
//using Construtor

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee(101,"sam",1000);
		
		System.out.println("Id:" +e.getId());
        System.out.println("Name: "+e.getName());
        System.out.println("Salary: "+e.getSal());

	}

}
