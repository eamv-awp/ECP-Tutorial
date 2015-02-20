package logic;

public class CalculatorController {
	
	protected double result;
	
	public CalculatorController() {
        double n1, n2;
        String operation;
        
        InputReader inputReader = newInputReader();
        
        n1 = inputReader.getN1();
        n2 = inputReader.getN2();
        operation = inputReader.getOperation();

        switch (operation)  {
        case "+":
            printResult(n1 + n2);
            break;

        case "-":
            printResult(n1 - n2);
            break;

        case "/":
            printResult(n1 / n2);
            break;

        case "*":
            printResult(n1 * n2);
            break;

        default:
            System.out.println("Je ne sais pas");

        }
	}
	
	private void printResult(double result) {
		this.result = result;
		System.out.println("Your answer is " + result);
	}

	protected InputReader newInputReader() {
		return new InputReaderImpl();
	}

}
