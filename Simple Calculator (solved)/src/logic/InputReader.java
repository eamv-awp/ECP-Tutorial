package logic;

import java.util.Scanner;

/**
 * The class is responsible for reading user input 
 * and performing basic validation before making it available.
 * 
 * @author awp
 */
public class InputReader {
	private Scanner scanner;
	private double n1, n2;
	private String operation;
	
	public InputReader() {
		scanner = new Scanner(System.in);
		
		n1 = readDouble("Enter first number");
		n2 = readDouble("Enter second number");
		
        System.out.println("Enter your operation");
        operation = scanner.next();
	}
	
	private double readDouble(String prompt) {
        System.out.println(prompt);
        double n;
        if (scanner.hasNextDouble())
        	n = scanner.nextDouble();
        else {
        	scanner.nextLine(); // discards current input
        	System.out.println("Invalid number");
        	n = readDouble(prompt);
        }
        return n;
	}
	
	public double getN1() {
		return n1;
	}
	
	public double getN2() {
		return n2;
	}
	
	public String getOperation() {
		return operation;
	}

}
