//Class:	CS5040	
//Term:		Spring 2023
//Name:		Cesar Villarreal
//Program Number: Assignment 1
//IDE	Eclipse

import java.util.Scanner;
public class PrintReverseVillarreal {
	
	public static Scanner input = new Scanner(System.in);
	
	// Main Method
	public static void main(String[] args) {
		
	while(true) {
		
	System.out.println("Enter a String:");
	String str = input.nextLine();
	
	System.out.println("Entered String:\t\t" + str);
	System.out.print("Reversed String:\t"); printCharsReverse(str);

	System.out.println("Retry? (Y/N): ");
	 char choice = input.nextLine().charAt(0);
	 if(choice == 'N' || choice == 'n'){
	        System.out.println("Program Terminated");
	        break;
	        
	 		}
		}
	}
	
	//Recursive Method
	 static void printCharsReverse(String str) {
		
		if (str == null || str.length() <= 1) {
			System.out.println(str);
		}
		else {
			System.out.print(str.charAt(str.length()-1));
			printCharsReverse(str.substring(0,str.length()-1));
		}
	}
}
