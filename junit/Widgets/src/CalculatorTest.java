import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {

	@Test
	public void canAdd() {
		Calculator calc = new Calculator();
		double result = calc.add(3.0, 4.0);
		assertEquals(7.0, result, 0.000001);
	}
	
	@Test
	public void canDivide() {
		Calculator calc = new Calculator();
		double result = calc.divide(4.0, 2.0);
		assertEquals(2.0, result, 0.000001);
	}

}
