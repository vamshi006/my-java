package practise;

public class Multiplication {

	private int a = 6;
	private int b = 5;
	
	public Multiplication() {
	//this is constructor
	}
	 
	
  	public int mul() {
		int mul = a*b;
		return mul;
	}
	
	public static void main(String[] args) {
	Multiplication mulref = new Multiplication();
 	int mul = mulref.mul();
	System.out.println("multiplication of two numbers is " +mul);
	}

}
