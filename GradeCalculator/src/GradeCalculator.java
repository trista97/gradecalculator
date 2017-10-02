/* Trista Reeves, 9/24/17, CGS 3416 */ 

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to the 2017 Java Gradebook!");
		
		//import scanner to take inputs, declare variables
		
		Scanner sc = new Scanner(System.in);
		double hwscore1;
		double hwscore2;
		double hwscore3;
		double hwscore4;
		double tscore1;
		double tscore2;
		double hwscoreavg;
		double overallavg;
		
		System.out.println("Please enter grades for the following: ");
		
		//ask user for the following inputs
		
		System.out.println("Homework 1:");
		hwscore1=sc.nextDouble();
		
		System.out.println("Homework 2:");
		hwscore2=sc.nextDouble();
		
		System.out.println("Homework 3:");
		hwscore3=sc.nextDouble();
		
		System.out.println("Homework 4:");
		hwscore4=sc.nextDouble();
		
		System.out.println("Test 1:");
		tscore1=sc.nextDouble();
		
		System.out.println("Test 2:");
		tscore2=sc.nextDouble();
		
		//calculate grade based on inputs with hw being worth 40%, test 1 worth 30%, test 2 worth 30%
		
		hwscoreavg = (hwscore1+hwscore2+hwscore3+hwscore4)/4;
		overallavg = (hwscoreavg*.4+tscore1*.3+tscore2*.3);
		
		System.out.println("Your final grade in the course is " + overallavg);
		
		//use conditional statement to match number value to letter grade
		
		if (overallavg <= 59.99) {
			 
			System.out.println( "Your letter grade is: F");
		
		} else if (overallavg <= 61.99) {
			
			System.out.println("Your letter grade is: D-");
	
		} else if (overallavg <= 68.99) {
			
			System.out.println("Your letter grade is: D");
			
		} else if (overallavg <= 71.99) {
			
			System.out.println("Your letter grade is: C-");
			
		} else if (overallavg <= 77.99) {
			
			System.out.println("Your letter grade is: C");
	
		} else if (overallavg <= 79.99) {
			
			System.out.println("Your letter grade is: C+");
			
		} else if (overallavg <= 81.99) {
			
			System.out.println("Your letter grade is: B-");
			
		} else if (overallavg <= 87.99) {
			
			System.out.println("Your letter grade is: B");
			
		} else if (overallavg <= 89.99) {
			
			System.out.println("Your letter grade is: B+");
			
		} else if (overallavg <= 91.99) {
			
			System.out.println("Your letter grade is: A-");
			
		} else {
			
			System.out.println("Your letter grade is: A");
		}
		
		System.out.println("Thanks for using the grade calculator, goodbye!");
		
		//close the scanner to get rid of memory leak error
		
		sc.close();
		
	}
	
}
