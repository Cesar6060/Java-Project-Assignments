//Class:	CS5000	
//Term:		Fall 2022
//Name:		Cesar Villarreal
//Program Number: Assignment 5 Programming 1
//IDE	Eclipse

public class AccountVillarreal {

	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreated;
	
	// No-arg Constructor
	public AccountVillarreal() {
		this(0, 0.0, 0.0);
	}
	// Constructor with specified  id, balance, annual interest rate
	public AccountVillarreal(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		dateCreated = new java.util.Date();
	}
	// Getters and Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
//	public void setDateCreated(java.util.Date dateCreated) {
//		this.dateCreated = dateCreated;
//	}
	
	// Monthly Interest Rate Method
	public double getMonthlyInterestRate() {
		return annualInterestRate / 1200;
	}
	
	// Monthly Interest Method
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	
	// Deposit Method
	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit of $" + depositAmount + " processed. New balance is $" + this.balance );

	}
	// Withdrawal Method
	public void withdrawal(double withdrawalAmount) {
		if(this.balance - withdrawalAmount < 0) {
			System.out.println("Only $" + balance + " available. Withdrawal not processed");
		}
		else {
			this.balance -= withdrawalAmount;
			System.out.println("Withdrawal of $" + withdrawalAmount + " processed. Remaining balance $" + this.balance);
		}
	}
	
	// toString Method
	public String toString() {
		return("Account ID:\t\t" + id
				+ "\nAccount Balance:\t$" + balance
				+ "\nInterest Rate:\t\t" + annualInterestRate + "%"
				+ "\nDate Opened:\t\t" + dateCreated);
	}
	
}
