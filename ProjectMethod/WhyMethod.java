
public class WhyMethod {

	private static void printTwoTimesB() {
		System.out.println("-");
		System.out.println("B");
		System.out.println("B");
	}
	
	public static void printTwoTimesA() {
		printTowTimesA_Refactoring();
	}
	
	public static void main(String[] args) {
		
//		// 100000000
		printTwoTimesB();
//
//		// 100000000
//		System.out.println("-");
//		System.out.println("A");
//		System.out.println("A");
		
		printTowTimesA_Refactoring();
		
		// 100000000
		printTwoTimesA();
	}



	private static void printTowTimesA_Refactoring() {
		System.out.println("-");
		System.out.println("A");
		System.out.println("A");
	}

}
