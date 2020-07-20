import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class ClassApp {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Constructor가 없음
		//그렇기 때문에 인스턴스를 만들지 않아도 사용 가능
		
		//System.out.println(Math.PI);
		//System.out.println(Math.floor(1.6));
		//System.out.println(Math.ceil(1.6));
		
		//Constructor가 있음
		//인스턴스를 만들어야 사용 가능
		
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();
		
		p1.write("Hello 1");
		
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
//		PrintWriter.write("result1.txt", "Hello 1");
//		PrintWriter.write("result2.txt", "Hello 2");
	}

}
