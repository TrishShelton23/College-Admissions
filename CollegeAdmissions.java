/*ADMISSIONS
 * SAT High - Low GPA PARTIAL
 * ACT High - Low GPA PARTIAL
 * BOTH High FULL
 *SAT Low - High GPA PARTIAL
 * ACT Low - High GPA PARTIAL
 * 
 */

import java.util.*;
public class CollegeAdmissions {
	public static void main(String[] args) {
	
		Scanner userIn = new Scanner(System.in);
		
		System.out.println("Welcome to University Academia!");
		System.out.println();
		
		System.out.println("Please enter your name: ");
		String name = userIn.nextLine();
		
		System.out.println(name+", did you take the SAT or ACT? or neither enter no.");
		String test = userIn.nextLine().toUpperCase();
		
		
		
		
		
		
		if(test.equals("SAT"))//SAT REQUIREMENTS
		{
			System.out.println("What score did you recieve?");
			int score = userIn.nextInt();
			
			if(score >= 1200 && score <= 1600)
			{
				System.out.println(name+",what was your overall GPA in school?");
				double gpa = userIn.nextDouble();
				
				if (gpa >= 3.0)
				{
					System.out.println("Congrats "+name+", you will recieve acceptance with full scholarship!" );
				}
				if(gpa <=2.9 && gpa >=2.0)
				{
					System.out.println("Congrats "+name+", you will recieve acceptance with partial scholarship!");
				}
				if(gpa<=1.9 && gpa>=1.1)
				{
					System.out.println(name+", you will be provisional or probationary acceptance!");
				}
				if (gpa<=1.0)
				{
					System.out.println("Sorry "+name+"you have been denied acceptence at this time.");
				}
				
			}
			
			else if (score <=1100)
			{
				System.out.println(name+",what was your overall GPA in school?");
				double gpa = userIn.nextDouble();
				
				if (gpa >= 3.5)
				{
					System.out.println("Congrats "+name+", you will recieve acceptance with full scholarship!" );
				}
				if(gpa <=3.4 && gpa >=3.0)
				{
					System.out.println("Congrats "+name+", you will recieve acceptance with partial scholarship!");
				}
				if(gpa<=2.9 && gpa>=2.1)
				{
					System.out.println(name+", you will be provisional or probationary acceptance!");
				}
				if (gpa<=2.0)
				{
					System.out.println("Sorry "+name+"you have been denied acceptence at this time.");
				}
			}
				
		}
		
		
		
		
		if(test.equals("ACT"))//ACT REQUIREMENTS
		{
			System.out.println("What score did you recieve?");
			int score = userIn.nextInt();
			
			if(score <= 26)
			{
				System.out.println(name+",what was your overall GPA in school?");
				double gpa = userIn.nextDouble();
				
				if (gpa >= 3.0)
				{
					System.out.println("Congrats "+name+", you will recieve acceptance with full scholarship!" );
				}
				if(gpa <=2.9 && gpa >=2.0)
				{
					System.out.println("Congrats "+name+", you will recieve acceptance with partial scholarship!");
				}
				if(gpa<=1.9 && gpa>=1.1)
				{
					System.out.println(name+", you will be provisional or probationary acceptance!");
				}
				if (gpa<=1.0)
				{
					System.out.println("Sorry "+name+"you have been denied acceptence at this time.");
				}
				
			}
			else if(score >=25)
			{
				{
					System.out.println(name+",what was your overall GPA in school?");
					double gpa = userIn.nextDouble();
					
					if (gpa >= 3.5)
					{
						System.out.println("Congrats "+name+", you will recieve acceptance with full scholarship!" );
					}
					if(gpa <=3.4 && gpa >=3.0)
					{
						System.out.println("Congrats "+name+", you will recieve acceptance with partial scholarship!");
					}
					if(gpa<=2.9 && gpa>=2.1)
					{
						System.out.println(name+", you will be provisional or probationary acceptance!");
					}
					if (gpa<=2.0)
					{
						System.out.println("Sorry "+name+"you have been denied acceptence at this time.");
					}
				}
			}
			if(test.equals("NO"))
			{
				System.out.println("Sorry "+name+", in order to be considered you must take either the SATs or ACTs.");
			}
				
			}
		  
			else {
			System.out.println("Sorry, didn't catch that!");
				 }
			}
	
	
}

		
	


