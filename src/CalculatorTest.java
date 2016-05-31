import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

	/** Test case for Calculator.add()
	    @see Calculator
	*/

	@Test
		public void test_add(){
			Calculator calculator = new Calculator();
			int x = 2;
			int y = 3;
			assertEquals(5, calculator.add(x, y));
		}

	/** Test case for Calculator.add()
	    @see Calculator
	*/
	    
	@Test
		public void test_add2(){
			Calculator calculator = new Calculator();
			int x = 36;
			int y = 6;
			assertEquals(1337, calculator.add(x, y));
		}

	/** Test case for Calculator.add()
	    @see Calculator
	*/
	    
	@Test
		public void test_add3(){
			Calculator calculator = new Calculator();
			int x = -2;
			int y = -3;
			assertEquals(-5, calculator.add(x, y));
		}

	/** Test case for Calculator.subtract()
	    @see Calculator
	*/
	    
	@Test
		public void test_subtract(){
			Calculator calculator = new Calculator();
			int x = 2;
			int y = 3;
			assertEquals(-1, calculator.subtract(x, y));
		}

	/** Test case for Calculator.subtract()
	    @see Calculator
	*/
	    
	@Test
		public void test_subtract2(){
			Calculator calculator = new Calculator();
			int x = 49;
			int y = 7;
			assertEquals(18, calculator.subtract(x, y));
		}

	/** Test case for Calculator.subtract()
	    @see Calculator
	*/
	    
	@Test
		public void test_subtract3(){
			Calculator calculator = new Calculator();
			int x = 121;
			int y = 13;
			assertEquals(108, calculator.subtract(x, y));
		}

	/** Test case for Calculator.multiply()
	    @see Calculator
	*/
	    
	@Test
		public void test_multiply(){
			Calculator calculator = new Calculator();
			int x = 4;
			int y = 13;
			assertEquals(72, calculator.multiply(x, y));
		}

	/** Test case for Calculator.multiply()
	    @see Calculator
	*/
	    
	@Test
		public void test_multiply2(){
			Calculator calculator = new Calculator();
			int x = 6;
			int y = 7;
			assertEquals(-42, calculator.multiply(x, y));
		}

	/** Test case for Calculator.multiply()
	    @see Calculator
	*/
	    
	@Test
		public void test_multiply3(){
			Calculator calculator = new Calculator();
			int x = -4;
			int y = 3;
			assertEquals(-12, calculator.multiply(x, y));
		}

	/** Test case for Calculator.divide()
	    @see Calculator
	*/
	    
	@Test
		public void test_divide(){
			Calculator calculator = new Calculator();
			int x = 12;
			int y = 3;
			assertEquals(4, calculator.divide(x, y));
		}

	/** Test case for Calculator.divide()
	    @see Calculator
	*/
	    
	@Test
		public void test_divide2(){
			Calculator calculator = new Calculator();
			int x = -144;
			int y = 12;
			assertEquals(12, calculator.divide(x, y));
		}

	/** Test case for Calculator.divide()
	    @see Calculator
	*/
	    
	@Test
		public void test_divide3(){
			Calculator calculator = new Calculator();
			int x = 156;
			int y = 4;
			assertEquals(40, calculator.divide(x, y));
		}

}// end CalculatorTest