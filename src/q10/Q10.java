package q10;

import Employee.Employee;


public class Q10 {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "sam", 1000);
		Q10 q=new Q10();
		q.show(emp);
		emp.setSal(emp.getSal()+100);
		q.show(emp);
	}

	public  void show(Employee ex) {
		System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSal());
		
	}
}
