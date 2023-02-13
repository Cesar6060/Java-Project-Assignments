//Class:	CS5040	
//Term:		Spring 2023
//Name:		Cesar Villarreal
//Program Number: Assignment 1
//IDE	Eclipse
import java.util.Scanner;
public class AverageGradeVillarreal {
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
	
		System.out.println("Enter Class Size:");
		int size = input.nextInt();
		
		int[] gradesArray = new int[size];
		System.out.println("Enter Grades between 0 and 100:");
		for(int i = 0; i < gradesArray.length; i++) {
			gradesArray[i] = input.nextInt();
		}
		
		System.out.println("Class Size:\t\t" + size);
		System.out.print("Entered Grades:\t\t");
			for(int i = 0; i < gradesArray.length; i++) {
				System.out.print(gradesArray[i] + " ");
			}	
		System.out.println("\nClass Average:\t\t" + Math.round(computeAverage(gradesArray, size)));
				
		input.nextLine();
		System.out.println("Retry? (Y/N): ");
		 char choice = input.nextLine().charAt(0);
		 if(choice == 'N' || choice == 'n'){
		        System.out.println("Program Terminated");
		        break;
		        
		 	}
		}
	}
	
	public static double computeAverage(int[] array, int size) {
		
		if (size == 1)
			return array[size - 1];
		else {
			return ((computeAverage(array, size - 1) * (size - 1) + array[size - 1]) / size);
		}
	}
}
