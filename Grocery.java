package practise;

public class Grocery {
	private String vegetables="all";
	private String fruits="fresh";
	private String pulses="dal";
	public void MyGrocery() {
		
		System.out.println("created grocery list");
	}
	public static void main (String[] args) {
		System.out.println("this is grocery store");
		Grocery objectReference=new Grocery();
		objectReference.MyGrocery();
	}
}
