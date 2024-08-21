package q6;

import Employee.Employee;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Employee emp=new Employee(101,"sam",1000);
        
        q6 q=new q6();
		
		q.show(emp);

	}
	
 public void show(Employee e) {
		
		System.out.println("Id:"+e.getId()+"  Name:"+e.getName() +"  Salary:"+e.getSal());
		
	}

}
