package q8;

import Employee.Employee;

public class Q8 {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "sam", 1000);
		Q8.show(emp);
		System.out.println(emp.getId()+" " + emp.getName() + " "+ emp.getSal());
	}

	public static void show(Employee ex) {
		System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSal());
		ex.setId(102);
	}
	
	//output  101 sam 1000
	//        102 sam 1000


}
