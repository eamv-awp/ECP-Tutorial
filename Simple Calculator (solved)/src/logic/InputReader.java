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
		
        System.out.println("Enter first number");
        n1 = scanner.nextDouble();

        System.out.println("Enter second number");
        n2 = scanner.nextDouble();

        System.out.println("Enter your operation");
        operation = scanner.next();
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
