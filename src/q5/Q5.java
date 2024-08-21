package q5;

import Employee.Employee;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee(101,"sam",1000);
		
		Q5.show(emp);

	}
	
	public static void show(Employee e) {
		
		System.out.println("Id:"+e.getId()+"  Name:"+e.getName() +"  Salary:"+e.getSal());
		
	}

}
