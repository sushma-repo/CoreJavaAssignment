package q7;

import Employee.Employee;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Employee e1=new Employee(101,"sam",1000);
		 Employee e2=new Employee(102,"Ram",2500);
		 
		 Q7.show(e1);
		 Q7.show(e2);

	}
	
public static void show(Employee emp) {
		
		System.out.println("Id:"+emp.getId()+"  Name:"+emp.getName() +"  Salary:"+emp.getSal());
		
	}

}
