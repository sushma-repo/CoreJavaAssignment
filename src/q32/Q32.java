package q32;

public class Q32 {

	public static int m1(int i){
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method from here in different ways
		
		System.out.println(Q32.m1(20));
		Q32 q=new Q32();
		System.out.println(q.m1(20));
		System.out.println(m1(20));
	}

}
