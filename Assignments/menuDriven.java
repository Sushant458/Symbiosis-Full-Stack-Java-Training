package javaProject;
import java.util.*;
public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	        int choice;
	        boolean cond = true;

	            while(cond) {
	            System.out.println("Menu:");
	            System.out.println("1. Addition");
	            System.out.println("2. Subtraction");
	            System.out.println("3. Multiplication");
	            System.out.println("4. Division");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            
	            switch (choice) {
	                case 1:
	                		System.out.println("Addition");
	                		System.out.println("Enter 1st number:");
	                		int num1=sc.nextInt();
	                		System.out.println("Enter 2st number:");
	                		int num2=sc.nextInt();
	                		int sum = num1+num2;
	                		System.out.println("Addition :"+sum);
	                    break;
	                case 2:
		                    System.out.println("Subtraction");
		                    System.out.println("Enter 1st number:");
		                    int a=sc.nextInt();
		                    System.out.println("Enter 2st number:");
		                    int b=sc.nextInt();
		                    int sub = a-b;
		                    System.out.println("Subtraction :"+sub);
	                    break;
	                case 3:
		                    System.out.println("Multiplication");
		                    System.out.println("Enter 1st number:");
		                    int x=sc.nextInt();
		                    System.out.println("Enter 2st number:");
		                    int y=sc.nextInt();
		                    int mul = x*y;
		                    System.out.println("Multiplication :"+mul);
	                    break;
	                case 4:
	                		System.out.println("Division");
	                		System.out.println("Enter 1st number:");
	                		int p=sc.nextInt();
	                		System.out.println("Enter 2st number:");
	                		int q=sc.nextInt();
	                		int div = p/q;
	                		System.out.println("Multiplication :"+div);
	                    break;
	                case 5:
	                    System.out.println("Exiting. Thank you!");
	                    cond = false;
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            
	        }
	      }

	}

}
