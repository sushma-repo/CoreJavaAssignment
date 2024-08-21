package q28;

public class Q28 {

	public static int m1(int i){
		System.out.println("m1 called");
		return i*i;
	}
	public static void main(String[] args) {
		
		int res= Q28.m1(3);
		//call m1 method and pass some number
		int total = 100 + res;
		System.out.println(total);
	}


}
