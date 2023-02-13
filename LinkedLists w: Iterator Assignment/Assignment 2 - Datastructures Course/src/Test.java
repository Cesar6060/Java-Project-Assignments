import java.util.LinkedList;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {

		LinkedList<Integer> javaList = new LinkedList<>();
		javaList.add(3);
		javaList.add(2);
		javaList.add(1);
		
		//Case 1
		ListIterator<Integer> iter = javaList.listIterator();
		while(iter.hasNext()) {
			System.out.print(iter.next());
		}
		System.out.println();

		//Case 2
		javaList.forEach(e -> System.out.print(e));
		System.out.println();
		
		//Case 3
		for(Integer e: javaList)
			System.out.print(e);
		System.out.println();
		
	}

}
