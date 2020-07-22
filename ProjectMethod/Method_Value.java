
public class Method_Value {

	public static void main(String[] args) {
					 // 인자 arguments
		printTwoTimes("A", "-");
		printTwoTimes("A", "*");
		printTwoTimes("A", "&");
		printTwoTimes("A", "!");
	}
	
									 // 매개변수 parameter
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
}
