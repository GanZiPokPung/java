
public class Method_Value {

	public static void main(String[] args) {
					 // ���� arguments
		printTwoTimes("A", "-");
		printTwoTimes("A", "*");
		printTwoTimes("A", "&");
		printTwoTimes("A", "!");
	}
	
									 // �Ű����� parameter
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
}
