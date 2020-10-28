package practise;

public class Division {
	
	private int a = 30;
	private int b = 5;
	
	public Division() {
	//this is constructor
	}
	
	public int div() {
		int div = a/b;
		return div;
	}
	
	public static void main(String[] args) {
	Division divref = new Division();
	int div = divref.div();
	System.out.println("division of two numbers is " +div);
	}
}
