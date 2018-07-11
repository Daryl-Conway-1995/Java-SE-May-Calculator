package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {

	@Test
	public void addtest() {
		Calculator calc = new Calculator();
		int actualValue = calc.add(2, 2);
		Assert.assertEquals(4, actualValue);
	}
	
	@Test
	public void minustest() {
		Calculator calc = new Calculator();
		int actualValue = calc.minus(7, 2);
		Assert.assertEquals(5, actualValue);
	}

	@Test
	public void dividetest() {
		Calculator calc = new Calculator();
		double actualValue = calc.divide(10, 2);
		Assert.assertEquals(5.0, actualValue,0.001);
		
	}
	
	@Test 
	public void multiplyTest() {
		Calculator calc = new Calculator();
		int actualValue = calc.mult(5, 2);
		Assert.assertEquals(10, actualValue);
		
	}
}
