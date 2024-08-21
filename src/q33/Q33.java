package q33;

import Employee.Employee;

public class Q33 {

	public static void show(Employee emp){
		
		System.out.println("Id:"+emp.getId()+"  Name:"+emp.getName() +"  Salary:"+emp.getSal());
	}
	public static void process(Employee e){
		e.setId(100);
		e.setName("Sam");
		e.setSal(2000);
		
	}
	public static void main(String[] args) {
		//do required changes in main,process and show method
		//create empty employee object here
		//add data into that empty object using process method
		//display employee object with data in show method
		
		Employee e=new Employee();
		Q33.process(e);
		Q33.show(e);
		
	}


}
