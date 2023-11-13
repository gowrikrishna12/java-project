package java_files;

import java.util.Scanner;

class Customer{
	int accountNumber;
	String accountType;
	String customerName;
	int accountBalance;
	Scanner sc=new Scanner(System.in);
	public void setCustomerDetails( ) {
		System.out.println("Enter the Account number");
		accountNumber=sc.nextInt();
		System.out.println("Enter the Account type");
		accountType=sc.next();
		System.out.println("Enter the Customer name");
		customerName=sc.next();
		System.out.println("Enter the account opening balance");
		accountBalance=sc.nextInt();
	}
	public void getCustomerDetails() {
		System.out.println("The customer details are:");
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Type: "+accountType);
		System.out.println("Customer Name: "+customerName);
		System.out.println("Account Balance "+accountBalance);
	}
}
public class Experiment {
	
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of customers");
	int noOfCustomers=sc.nextInt();
	Customer [] customer=new Customer[noOfCustomers];
	for(int i=0;i<noOfCustomers;i++) {
		customer[i]=new Customer();
		customer[i].setCustomerDetails();
	}
	for(int i=0;i<noOfCustomers;i++) {
		customer[i].getCustomerDetails();
	}
}

}
