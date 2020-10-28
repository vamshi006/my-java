package practise;

public class ClassRoom {
	private String students="45";
	private String benches="30";
	private String blackboard="1";
	public void MyClass() {
		
		System.out.println("created attributes for my classroom");
	}
	public static void main (String[] args) {
		System.out.println("this is my classroom");
		ClassRoom objectReference=new ClassRoom();
		objectReference.MyClass();
	}
}
