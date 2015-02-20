package logic;

public class CalculatorController {
	
	public CalculatorController() {
        double n1, n2;
        String operation;
        
        InputReader inputReader = new InputReader();
        
        n1 = inputReader.getN1();
        n2 = inputReader.getN2();
        operation = inputReader.getOperation();

        switch (operation)  {
        case "+":
            System.out.println("Your answer is " + (n1 + n2));
            break;

        case "-":
            System.out.println("Your answer is " + (n1 - n2));
            break;

        case "/":
            System.out.println("Your answer is " + (n1 / n2));
            break;

        case "*":
            System.out.println("Your asnwer is " + (n1 * n2));
            break;

        default:
            System.out.println("Je ne sais pas");

        }
	}

}
