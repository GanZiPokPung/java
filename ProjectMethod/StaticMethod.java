
// static    - class method
// no static - instance method

class Print {
	public String delimiter;
	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}

	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
}

public class StaticMethod {
	public static void main(String[] args) {
//		Print.a("-");
//		Print.b("-");
		
		// instance
		Print t1 = new Print();
		t1.delimiter = "-";
		t1.a();
		t1.b();
		//Print.a(); // static 함수가 아니므로 Print 클래스는 instance 소속이다.
				     // 그러므로 이런식으로 사용할 수 없다.
			
//		Print.a("*");
//		Print.b("*");
		
		Print t2 = new Print();
		t2.delimiter = "*";
		t2.a();
		t2.b();
	}
}
