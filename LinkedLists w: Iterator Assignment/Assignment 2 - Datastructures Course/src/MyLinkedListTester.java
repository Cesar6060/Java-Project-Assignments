
public class MyLinkedListTester {
	
	public static void printTestName(String str) {
		System.out.println();
		System.out.println("=================================");
		System.out.println("\t" + str);
		System.out.println("=================================");
	}
	
	public static void showMessages(String exStr, String incorrectStr) {
		System.out.println("#################################");
		System.out.println("Exception Occurs in Tester [" + exStr + "]");
		System.out.println("Incorrect Opration in Tester [" + incorrectStr + "]");
		System.out.println("#################################");
		System.out.println();
	}
	public static void main(String[] args) {
		
		String excNums = "";
		String incorrectNums = "";
		boolean isGood = false;
		// Checking addFirst() correctly works
		try {
			isGood = linkedListTester1(); // add first must work because it is given by me.
		}catch(Exception e) {
			excNums = excNums +" 1 ";
		}
		if(!isGood) incorrectNums = incorrectNums + " 1 ";

		// Checking addLast() correctly works
		try {isGood = linkedListTester2();} catch(Exception e) {excNums = excNums +" 2 ";}	
		if(!isGood) incorrectNums = incorrectNums + " 2 ";
		
		// Checking add() correctly works
		try {isGood = linkedListTester3();} catch(Exception e) {excNums = excNums +" 3 ";}		
		if(!isGood) incorrectNums = incorrectNums + " 3 ";
		
		// Checking removeFirst() correctly works
		try {isGood = linkedListTester4();} catch(Exception e) {excNums = excNums +" 4 ";}
		if(!isGood) incorrectNums = incorrectNums + " 4 ";
		
		// Checking removeLast() correctly works
		try {isGood = linkedListTester5();} catch(Exception e) {excNums = excNums +" 5 ";}	
		if(!isGood) incorrectNums = incorrectNums + " 5 ";

		// Checking remove() correctly works
		try {isGood = linkedListTester6();} catch(Exception e) {excNums = excNums +" 6 ";}		
		if(!isGood) incorrectNums = incorrectNums + " 6 ";

		// Checking getFirst() correctly works
		try {isGood = linkedListTester7();} catch(Exception e) {excNums = excNums +" 7 ";}		
		if(!isGood) incorrectNums = incorrectNums + " 7 ";

		// Checking getLast() correctly works
		try {isGood = linkedListTester8();} catch(Exception e) {excNums = excNums +" 8 ";}		
		if(!isGood) incorrectNums = incorrectNums + " 8 ";

		// Checking indexOf() correctly works
		try {isGood = linkedListTester9();} catch(Exception e) {excNums = excNums +" 9 ";}		
		if(!isGood) incorrectNums = incorrectNums + " 9 ";

		// Checking Iterator next() and hasNext() correctly works
		try {isGood = linkedListIteratorTest1();} catch(Exception e) {excNums = excNums +" A ";}
		if(!isGood) incorrectNums = incorrectNums + " A ";

		// Checking Iterator remove() correctly works
		try {isGood = linkedListIteratorTest2();} catch(Exception e) {excNums = excNums +" B ";}
		if(!isGood) incorrectNums = incorrectNums + " B ";
				
		showMessages(excNums, incorrectNums);
		
	}
	public static boolean linkedListTester1() {
		printTestName("[1] addFirst() Tester");
		MyLinkedListVillarreal<String> myList = new MyLinkedListVillarreal<>();

		myList.addFirst("CC");
		myList.addFirst("BB");
		myList.addFirst("AA");
	
		System.out.println(myList + "  <-- Your List");
		System.out.println("[AA, BB, CC]  <-- Correct List");
		if(myList.toString().equals("[AA, BB, CC]"))
			return true;
		return false;		
	}
	public static boolean linkedListTester2() {
		printTestName("[2] addLast() Tester");
		MyLinkedListVillarreal<String> myList = new MyLinkedListVillarreal<>();

		myList.addLast("CC");
		myList.addLast("BB");
		myList.addLast("AA");
	
		System.out.println(myList + "  <-- Your List");
		System.out.println("[CC, BB, AA]  <-- Correct List");
		if(myList.toString().equals("[CC, BB, AA]"))
			return true;
		return false;
	}
	public static boolean linkedListTester3() {
		printTestName("[3] add() Tester");
		MyLinkedListVillarreal<String> myList = new MyLinkedListVillarreal<>();

		myList.add(0,"DD");
		myList.add(0,"CC");
		myList.add(0,"BB");
		myList.add(3,"EE");
		myList.add(0,"AA");
		System.out.println(myList + "  <-- Your List");
		System.out.println("[AA, BB, CC, DD, EE]  <-- Correct List");
		
		if(myList.toString().equals("[AA, BB, CC, DD, EE]"))
			return true;
		return false;
		
	}
	public static boolean linkedListTester4() {
		printTestName("[4] removeFirst() Tester");
		MyLinkedListVillarreal<String> myList = new MyLinkedListVillarreal<>();
		
		myList.addFirst("CC");
		myList.addFirst("BB");
		myList.addFirst("AA");
		
		myList.removeFirst();
		myList.removeFirst();
		System.out.println(myList + "  <-- Your List");
		System.out.println("[CC]  <-- Correct List 1");
		
		if(!myList.toString().equals("[CC]"))
			return false;
		
		myList.removeFirst();
		System.out.println(myList + "  <-- Your List");
		System.out.println("[]  <-- Correct List 1");
		
		if(myList.toString().equals("[]"))
			return true;
		return false;
	}
	public static boolean linkedListTester5() {
		printTestName("[5] removeLast() Tester");
		MyLinkedListVillarreal<String> myList = new MyLinkedListVillarreal<>();
		
		myList.addFirst("CC");
		myList.addFirst("BB");
		myList.addFirst("AA");
		
		myList.removeLast();
		System.out.println(myList + "  <-- Your List");
		System.out.println("[AA, BB]  <-- Correct List");
		if(!myList.toString().equals("[AA, BB]"))
			return false;
		
		myList.removeLast();
		myList.removeLast();
		System.out.println(myList + "  <-- Your List");
		System.out.println("[]  <-- Correct List");
		
		if(myList.toString().equals("[]"))
			return true;
		return false;
	}
	public static boolean linkedListTester6() {
		printTestName("[6] remove(index) Tester");
		MyLinkedListVillarreal<String> myList = new MyLinkedListVillarreal<>();
		
		myList.addFirst("CC");
		myList.addFirst("BB");
		myList.addFirst("AA");
		
		myList.remove(0);
		System.out.println(myList + "  <-- Your List");
		System.out.println("[BB, CC]  <-- Correct List");
		if(!myList.toString().equals("[BB, CC]"))
			return false;
		myList.remove(1);
		System.out.println(myList + "  <-- Your List");
		System.out.println("[BB]  <-- Correct List");
		if(myList.toString().equals("[BB]"))
			return true;
		return false;
	}
	public static boolean linkedListTester7() {
		printTestName("[7] getFirst() Tester");
		MyLinkedListVillarreal<String> myList = new MyLinkedListVillarreal<>();
		
		myList.addFirst("CC");
		myList.addFirst("BB");
		myList.addFirst("AA");
		
		System.out.println(myList.getFirst() + "  <-- Your element");
		System.out.println("AA  <-- Correct element");
		
		if(myList.getFirst().equals("AA"))
			return true;
		return false;
	}
	public static boolean linkedListTester8() {
		printTestName("[8] getLast() Tester");
		MyLinkedListVillarreal<String> myList = new MyLinkedListVillarreal<>();
		
		myList.addFirst("CC");
		myList.addFirst("BB");
		myList.addFirst("AA");
		
		System.out.println(myList.getLast() + "  <-- Your element");
		System.out.println("CC  <-- Correct element");
		if(myList.getLast().equals("CC"))
			return true;
		return false;
	}
	public static boolean linkedListTester9() {
		printTestName("[9] indexOf() Tester");
		MyLinkedListVillarreal<String> myList = new MyLinkedListVillarreal<>();
		
		myList.addFirst("DD");
		myList.addFirst("CC");
		myList.addFirst("BB");
		myList.addFirst("AA");
		
		System.out.println(myList.indexOf("CC") + "  <-- Your element");
		System.out.println("2  <-- Correct element");
		if(myList.indexOf("CC") == 2)
			return true;
		return false;
	}
	public static boolean linkedListIteratorTest1() {
		printTestName("Iterator Basic Tester");

		MyLinkedListVillarreal<String> myList = new MyLinkedListVillarreal<>();
		String result = "";
		myList.addFirst("JKL");
		myList.addFirst("GHI");
		myList.addFirst("DEF");
		myList.addFirst("ABC");
		MyLinkedListVillarreal<String>.Iterator iter = myList.iterator();
		while(iter.hasNext()) {
			String word = iter.next();
			System.out.print(word+" ");
			result = result + word;
		}
		System.out.println(" <-- Your List");
		System.out.println("ABC DEF GHI JKL  <-- Correct List");
		if(result.equals("ABCDEFGHIJKL"))
			return true;
		return false;
				
	}
	public static boolean linkedListIteratorTest2() {
		printTestName("Iterator remove() Tester");

		MyLinkedListVillarreal<String> myList = new MyLinkedListVillarreal<>();

		myList.addFirst("JKL");
		myList.addFirst("GHI");
		myList.addFirst("DEF");
		myList.addFirst("ABC");
		MyLinkedListVillarreal<String>.Iterator iter = myList.iterator();
		
		iter.next();
		iter.next();
		iter.remove();
		
		System.out.print(myList);
		System.out.println("  <-- Your List");
		System.out.println("[ABC, GHI, JKL]  <-- Correct List");
		if(myList.toString().equals("[ABC, GHI, JKL]"))
			return true;
		return false;
	}

}
