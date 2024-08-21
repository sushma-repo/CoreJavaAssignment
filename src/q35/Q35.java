package q35;

public class Q35 {

	static int total = 0;

	public static int add() {  
		int total = 10 + 30;
		return total;
	}

	public static void main(String[] args) {
		Q35.add();
		System.out.println(total);
	}

    // output is Zero
	//The value comes from static variable total which is declared at class level 
	// where total in add method is a local variable so the scope of the value is within add method
}
