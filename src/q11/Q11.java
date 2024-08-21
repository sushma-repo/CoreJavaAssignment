package q11;




public class Q11 {

	public static void main(String[] args) {
		//call show method in different ways
		
		show(); // direct call 
		Q11.show(); //calling  show method using class
		Q11 q=new Q11();
		q.show();  // calling show method using reference
		
		
	}
	public static void show(){
		System.out.println("show method");
	}


}
