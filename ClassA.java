package practise;

public class ClassA {
	private String name="vamshi";
	private int var1=22;
	public String method1() {
		System.out.println("robosoft");
		return name;
		
	} 
	public static void main(String[] args) {
		System.out.println("my team members are");
		ClassA aref=new ClassA();
		
		String var4=aref.name;
		System.out.println("Name="+var4);
		int var5=aref.var1;
		System.out.println("age="+var5);
		ClassB bref=new ClassB();
		String var6=bref.var2;
		System.out.println("name="+var6);
		int var7=bref.var3;
		System.out.println("age="+var7);
	}

}
