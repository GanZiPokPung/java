
class Print {
	public static String delimiter = "";
	public static void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public static void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}

class Print_Inst {
	public String delimiter = "";
	public Print_Inst(String delimiter) {
		this.delimiter = delimiter;
	}
	public void A() {
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}

public class MyOOP {

	public static void main(String[] args) {
		Print.delimiter = "----";
		Print.A();
		Print.A();
		Print.B();
		Print.B();
		
		Print.delimiter = "****";
		Print.A();
		Print.A();
		Print.B();
		Print.B();
		
		Print_Inst p1 = new Print_Inst("----");
//		p1.delimiter = "----";
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		Print_Inst p2 = new Print_Inst("****");
//		p2.delimiter = "****";
		p2.A();
		p2.A();
		p2.B();
		p2.B();
	}

}
