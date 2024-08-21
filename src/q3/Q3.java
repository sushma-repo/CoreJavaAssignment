package q3;

import Employee.Employee;
//using setter

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Employee e=new Employee();
          
          e.setId(101);
          e.setName("Sam");
          e.setSal(1000);
          
          System.out.println("Id:" +e.getId());
          System.out.println("Name: "+e.getName());
          System.out.println("Salary: "+e.getSal());
	}

}
