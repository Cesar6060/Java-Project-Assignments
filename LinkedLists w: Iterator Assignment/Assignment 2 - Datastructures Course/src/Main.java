
public class Main {

	public static void main(String[] args) {

		MyLinkedListVillarreal<Integer> list = new MyLinkedListVillarreal<>();
		
		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		System.out.println(list);
		System.out.println(list.getLast());
		System.out.println(list.indexOf(00));
		
//		[10 -> 20 -> 30 -> 40 -> 50]
		
		
		
		
//		list.reverse();
//		var array = list.toArray();
//		System.out.println(Arrays.toString(array));
//		list.removeLast();
//		list.removeFirst();
//		System.out.println(list.size());
//		System.out.println(list.contains(10));

		
	}

}
