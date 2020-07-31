import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class testApp {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(9);
		l.add(8);
		
		Iterator<Integer> iterator = l.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		iterator = l.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
