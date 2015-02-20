import static org.junit.Assert.*;
import logic.CalculatorController;
import logic.InputReader;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SystematicTests {
	
	/* DEFINITIONS
	 * n1 is the number entered as the first input
	 * n2 is the number entered as the second input
	 * op is the operator entered as the third input
	 * 
	 * VALID INPUT (in general)
	 * -100.0 <= n1 <= 100.0
	 * -100.0 <= n2 <= 100.0
	 * op in {"+", "-", "*", "/"}
	 * 
	 * VALID PARTITIONS
	 * EC01: -100.0 <= n1 <= 100.0, -100.0 <= n2 <= 100.0, op = "+"
	 * EC02: -100.0 <= n1 <= 100.0, -100.0 <= n2 <= 100.0, op = "-"
	 * EC03: -100.0 <= n1 <= 100.0, -100.0 <= n2 <= 100.0, op = "*"
	 * EC04: -100.0 <= n1 <= 100.0, -100.0 <= n2 <    0.0, op = "/"
	 * EC05: -100.0 <= n1 <= 100.0,    0.0 <  n2 <= 100.0, op = "/"
	 * 
	 * INVALID PARTITIONS (unspecified input must be valid)
	 * EC06: n2 = 0.0, op = "/"
	 * EC07: n1 < -100.0
	 * EC08: n1 > 100.0
	 * EC09: n2 < -100.0
	 * EC10: n2 > 100.0
	 * EC11: op not in {"+", "-", "*", "/"}
	 * EC12: n1 not a number
	 * EC13: n2 not a number
	 * 
	 * TEST CASES
	 * TC01: n1 =    8.0,  n2 = -100.0,  op = "+"   =>   "Your answer is -92.0"
	 *       Covers EC01, checks boundary for n2
	 * TC02: n1 = -100.0,  n2 =  -20.0,  op = "-"   =>   "Your answer is -80.0"
	 *       Covers EC02, checks boundary for n1
	 * TC03: n1 =   -2.0,  n2 =  100.0,  op = "*"   =>   "Your answer is -200.0"
	 *       Covers EC03, checks boundary for n2
	 * TC04: n1 =   50.0,  n2 =   -0.1,  op = "/"   =>   "Your answer is -500.0"
	 *       Covers EC04, checks boundary for n2 for division special case
	 * TC05: n1 =  100.0,  n2 =    0.1,  op = "/"   =>   "Your answer is 1000.0"
	 *       Covers EC05, checks boundary for n1 and for n2 for division special case
	 * TC06: n1 =    5.0,  n2 =    0.0,  op = "/"   =>   "Cannot divide by 0"
	 *       Covers EC06, checks boundary for n2 for division special case
	 * TC07: n1 = -100.1,  n2 =    0.0,  op = "+"   =>   "Invalid number"
	 *       Covers EC07, checks boundary for n1
	 * TC08: n1 =  100.1,  n2 =    0.0,  op = "+"   =>   "Invalid number"
	 *       Covers EC08, checks boundary for n1
	 * TC09: n1 =    0.0,  n2 =  100.1,  op = "+"   =>   "Invalid number"
	 *       Covers EC09, checks boundary for n2
	 * TC10: n1 =    0.0,  n2 = -100.1,  op = "+"   =>   "Invalid number"
	 *       Covers EC10, checks boundary for n2
	 * TC11: n1 =    5.0,  n2 =    2.0,  op = "%"   =>   "Je ne sais pas"
	 *       Covers EC11
	 * TC12: n1 = "Five",  n2 =    0.0,  op = "+"   =>   "Invalid number"
	 *       Covers EC12
	 * TC13: n1 =    0.0,  n2 = "Four",  op = "+"   =>   "Invalid number"
	 *       Covers EC13
	 * TC14: n1 =   50.0,  n2 =    0.0,  op = "-"   =>   "Your answer is 50.0"
	 *       Covers EC02, checks boundary for n2 for division special case (which should not affect other operators)
	 * 
	 */

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test8PlusNegative100Equals92() {
		assertEquals(-92, new CalculatorControllerStub().getResult(), 0);
	}
	
	private class CalculatorControllerStub extends CalculatorController {
		
		public double getResult() {
			return this.result;
		}
		
		@Override
		protected InputReader newInputReader() {
			return new InputReader() {

				@Override
				public double getN1() {
					return 8;
				}

				@Override
				public double getN2() {
					return -100;
				}

				@Override
				public String getOperation() {
					return "+";
				}
				
			};
		}
	}

}
