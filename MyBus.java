package practise;

public class MyBus {
	private String driver="1";
	private String seats="35";
	private String passengers="40";
	public  MyBus() {
		
		System.out.println("created attributes for my bus");
	}
	public static void main (String[] args) {
		System.out.println("this is my bus");
		MyBus objectReference=new MyBus();
		
	}
}
