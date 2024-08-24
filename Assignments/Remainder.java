package javaProject;
import java.util.*;
public class Reminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("REMINDER");
		int divident,divisor;
		//Accept the value by the user by the Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Divident value:");
		divident = sc.nextInt();//accept the divident value
		System.out.println("Enter the Divisor value:");
		divisor = sc.nextInt();//aacept the divisor value
		//calculate the Quotient
		int quotient = divident/divisor;
		System.out.println("Quotient is "+quotient);
		//calculate the Remainder
		int remainder = divident - (divisor * quotient);
		System.out.println("Remainder is :"+remainder);
		
	}

}
