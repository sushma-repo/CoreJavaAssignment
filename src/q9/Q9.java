package q9;

import Employee.Employee;


public class Q9 {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "sam", 1000);
		Q9.show(emp);
		emp.setSal(emp.getSal()+100);
			Q9.show(emp);
	}

	public static void show(Employee ex) {
		System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSal());
		
	}
}
