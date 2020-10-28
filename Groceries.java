package practise;

public class Groceries {
		private String staff;
		private String billingsection;
		private String foodproducts;
		public void myGroceries()
		{
			System.out.println("groceries will have");
			System.out.println("vegetables");		
			System.out.println("fruits");
			System.out.println("pulses");
		}
		
		public void vegetables() {
			System.out.println("carrot");		
			System.out.println("potato");
			System.out.println("spinach");
		}
		
		public void fruits() {
			System.out.println("grapes");		
			System.out.println("guava");
			System.out.println("mangoes");
		}
		
		
		
		public void dairyproducts() {
			System.out.println("milk");		
			System.out.println("butter");
			System.out.println("ghee");
		}
		
		
		public static void main (String[] args) {
			System.out.println("we have all these in supermarket");
			Groceries objectReference=new Groceries();
			objectReference.myGroceries();
			objectReference.vegetables();
			objectReference.fruits();
			objectReference.dairyproducts();
		}
}
