package q13;

public class Q13 {

	int x = 10;
	public void show(){
		
		int x = 100;
		System.out.println(x);//do required changes at this line but output should be 100	
		
		Q13 q=new Q13();
		System.out.println(q.x);//do required changes at this line but output should be 10
	}
	public static void main(String[] args) {
		Q13 d = new Q13();
		d.show();
	}	


}
