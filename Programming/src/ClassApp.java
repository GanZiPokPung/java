import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class ClassApp {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Constructor�� ����
		//�׷��� ������ �ν��Ͻ��� ������ �ʾƵ� ��� ����
		
		//System.out.println(Math.PI);
		//System.out.println(Math.floor(1.6));
		//System.out.println(Math.ceil(1.6));
		
		//Constructor�� ����
		//�ν��Ͻ��� ������ ��� ����
		
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
