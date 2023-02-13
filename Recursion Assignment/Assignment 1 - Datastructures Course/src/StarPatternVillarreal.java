//Class:	CS5040	
//Term:		Spring 2023
//Name:		Cesar Villarreal
//Program Number: Assignment 1
//IDE	Eclipse
import java.util.Scanner;
public class StarPatternVillarreal {
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
		
		System.out.println("Enter Number of Rows:");
		int n = input.nextInt();
		
		printPattern(n, n);
		
		input.nextLine();
		System.out.println("Retry? (Y/N): ");
		 char choice = input.nextLine().charAt(0);
		 if(choice == 'N' || choice == 'n'){
		        System.out.println("Program Terminated");
		        break;
		        
		 	}
		}
	}
	
	// function to print spaces
	static void printSpace(int space) {
	    if (space == 0)
	        return;
	    System.out.print(" ");
	 
	    // recursively calling print_space()
	    printSpace(space - 1);
	}
	 
	// function to print asterisks
	static void printStar(int star) {
	    if (star == 0)
	        return;
	    System.out.print("* ");
	 
	    // recursively calling asterisk()
	    printStar(star - 1);
	}
	 
	// function to print the pattern
	static void printPattern(int n, int num) {
	    
		if (n == 0)
	        return;
	    printSpace(num - n + 1); 
	    printStar(n * 2 - 1); 
	    System.out.println(" "); 
	 
	    // recursively calling pattern()
	    printPattern(n - 1 , num + 1); 
	}
}
	
