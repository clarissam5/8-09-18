import java.util.Scanner;

public class Exceptions {
	
	public static void main(String args[]) {
		
		//System.out.println(args[1]);
		for (String x : args) {
			System.out.println(x); 
		}
		
	try {
		calculate(2,1);
		calculate(10,9);
		
		}
	catch(ArithmeticException e) {
		System.out.println(e.getMessage());//gets the detail message
		//e.printStackTrace();
		System.out.println();
		}
	finally {
		System.out.println("Print this no matter what");
		}
	}
	
	
	
	static void calculate(int a, int b) {
		System.out.println(divide(a, b));
		}
	
	static int divide(int x, int y) {
		return x/y;
		}
	/*
	 * So, the 2 & 0 integers will pass their value to the next methods to come (calculate, divide) due to the order they are in amongst out stack. 
	 * Stack order for 2,1 -> main, call calculate, calculate call divide (divide is on top) 
	 * Division occurs with named values (2,1) and will return the value 
	 * Once the division is done, calculate is done and then goes back to the main function, which will move into calculate (10,9) 
	 */
	
	
}

/*Command Line Prompt
 * C:\Users\Clarissa\eclipse-workspace\8-09-18\src> javac Exceptions.java

C:\Users\Clarissa\eclipse-workspace\8-09-18\src> java Exceptions 1 abc 234
1
abc
234
2
1
Print this no matter what
 */
