package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {
	
	private static Calculator calc = new Calculator();
	

	@Test
	public void addtest() {
		int actualValue = calc.add(2, 2);
		Assert.assertEquals(4, actualValue);
	}
	
	@Test
	public void minustest() {
		int actualValue = calc.subtract(7, 2);
		Assert.assertEquals(5, actualValue);
	}

	@Test
	public void dividetest() {
		double actualValue = calc.divide(10, 2);
		Assert.assertEquals(5.0, actualValue,0.001);
		
	}
	
	@Test 
	public void multiplyTest() {
		int actualValue = calc.mult(5, 2);
		Assert.assertEquals(10, actualValue);
		
	}
}
