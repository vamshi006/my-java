package practise;

public class Addition {
	
	private int a = 5;
	private int b = 6;
	private int c = 7;
	
	public Addition() {
	//this is constructor
	}
	
	
	public int add() {
		int sum = a+b+c;
		return sum;
	}
	
public static void main(String[] args) {
	Addition addref = new Addition();
	int sum = addref.add();
	System.out.println("sum of three numbers is " +sum);
}
	


}
