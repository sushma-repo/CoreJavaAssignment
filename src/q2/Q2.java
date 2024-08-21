package q2;

import Employee.Employee;

public class Q2 {
	
	//here create object of Employee class and add 101,sam,1000 data into that

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Employee e=new Employee(101,"sam",1000);
          
          System.out.println("Id:" +e.getId());
          System.out.println("Name: "+e.getName());
          System.out.println("Salary: "+e.getSal());
	
	}

}
