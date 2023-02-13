package studentdatabaseapp;

import java.util.Scanner;

import javax.swing.text.GapContent;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//Constructor: Prompt user to enter student's name and year
	public Student() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter student first name: ");
		this.firstName = input.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = input.nextLine();
		
		System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student grade level: ");
		this.gradeYear =input.nextInt();
		
		
		setStudentID();
		
	}
	
	//Generate an ID
	private void setStudentID() {
		id++;
		this.studentID = gradeYear + "" + id;
		
	}
	
	//Enroll in courses
	public void enroll() {
		
		do {
		
		System.out.println("Enter course to enroll( 0 to quit): ");
		Scanner input = new Scanner(System.in);
		String course = input.nextLine();
		
		if(!course.equals("Q")) {
			courses = courses + "\n" + course;
			tuitionBalance = tuitionBalance + costOfCourse;
		}
		else {
			break;
		}
	}
		while( 1 != 0);
				
	}
	
	
	//View Balance 
	public void viewBalance() { 
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	//Pay Balance
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your Payment: $");
		Scanner input = new Scanner(System.in);
		int payment = input.nextInt();
		tuitionBalance =  tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	//Show status
	public String toString() {
	return"Name: " + firstName + " " + lastName +
						"\nGrade Level: " + gradeYear +
						"\nStudent ID: " + studentID +
						"\nCourses Enrolled: " + courses +
						"\nBalance: $" + tuitionBalance;	
	}

	
	
	
}
