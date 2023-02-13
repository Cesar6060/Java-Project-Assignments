//Class:	CS5000	
//Term:		Fall 2022
//Name:		Cesar Villarreal
//Program Number: Assignment 5 Programming 1
//IDE	Eclipse

import java.util.Scanner;
public class TestAccountVillarreal {

	public static void main(String[] args) {

		
		// Account Object 1
		AccountVillarreal myAccount = new AccountVillarreal(12345, 10000, 3.2);
		myAccount.withdrawal(3500);
		myAccount.deposit(500);
		System.out.println("Earned Monthly Interest:\t$ " + Math.round(myAccount.getMonthlyInterest()*100.0)/100.0);
		System.out.println("Date Account Was Created:\t" + myAccount.getDateCreated());
		System.out.println(myAccount);
	
		while(true) {
		// User Input For Account Object 2
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter Account ID: ");
		int id = input.nextInt();
		input.nextLine();
		System.out.println("Please Enter Account Balance: ");
		double balance = input.nextDouble();
		input.nextLine();
		System.out.println("Please Enter Annual Interest Rate: ");
		double interestRate = input.nextDouble();
		input.nextLine();

		
		// Account Object 2
		AccountVillarreal myAccount2 = new AccountVillarreal(id, balance, interestRate);
		myAccount2.withdrawal(15000);
		myAccount2.deposit(5000);
		System.out.println("Earned Monthly Interest:\t$ " + Math.round(myAccount2.getMonthlyInterest()*100.0)/100.0);
		System.out.println("Date Account Was Created:\t" + myAccount2.getDateCreated());
		System.out.println(myAccount2);
		
		System.out.println("Retry? (Y/N): ");
		 char choice = input.next().charAt(0);
		 if(choice == 'N' || choice == 'n'){
		        System.out.println("Program Terminated");
		        break;
		    }
		}
	}
}
