/*
 * Arrays Initializing with Values 
 * int boolean double char String 
 * 1)Create array & all primitive data types & string
 * 2)int & boolean -> initializing with values 
 * 3) use for loop & print even indice values for int 
 * 4) use for each loop for Strings and print each element 
 * Athor:Clarissa Mercado
 * Date: 8-09-18
 */
import java.util.Random;
import java.util.Scanner;
public class School {
	//create five arrays
			//for each 
		private static String[] person = {"Brad ", "Judy ", "Anna ", "John ", "Alex "};
			//intialize print even indices 
		private static int[] seat = {12,4,3,9,4};
			//for loop - random values 
		private static double[] tuition = new double [5]; 
			//for loop
		private static char[] grade = {'A', 'F', 'C', 'D', 'A'};
			//initialize, print 
		private static boolean[] passing = {true, false, true, false, true};
		
		private static int[] position = { 0, 1, 2, 3, 4, 5};
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		// For Each loop for String array 
			System.out.print("The following students are enrolled: " );
				for(String p : person) {
					System.out.print(p);
				}
		//Extra print array 		
			System.out.print("\n" + "SPOT on ROSTER" + "\t" + "       "+ "Name" + " " + "Grade" );	
				for (int i = 0; i < 5; i++) {
					System.out.print("\n" + "Position on roster " + position[i] + " : " + person[i]+ grade[i]);
					}
		
			//For loop for random values 
				Random rand = new Random();
					for (int i = 0; i < tuition.length; i++) {
						tuition[i] = rand.nextInt(10000);
						//System.out.print("\n" +"Position" + i + ":" + tuition[i]);
						}
				
		//Trying exception output using scanner object and int array 		
			System.out.println("\n" + "Type the position of the student whose tuition you want to display: " );	
					int choice;
				try {
				System.out.println(tuition[choice = input.nextInt()]);
					}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Position not on roster. Please choose another number.");
					}
		//Print even indices for int array 
			System.out.println("------ Even Indices ------");
				for (int i = 0; i<seat.length; i+=2) {
	                System.out.println("\n" + seat[i]);
	                }     
	            	
		
		//For loop for char array 
			System.out.println("------ Character Grades ------");
				for (int i = 0; i<grade.length; i++) {
					System.out.println("\n" + grade[i]);
				}
		//Boolean
			System.out.println("------ Boolean ------");
				System.out.println("\n" +passing[3]);
				
		}
}
