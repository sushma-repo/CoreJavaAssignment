package q29;

public class Q29 {

	public static float m1(int i){
		System.out.println("m1 called");
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method and pass some number
		float val=Q29.m1(3);
		int total =  100 + (int) val;
		System.out.println(total);
	}


}
