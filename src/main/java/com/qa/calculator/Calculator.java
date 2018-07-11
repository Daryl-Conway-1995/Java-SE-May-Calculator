package com.qa.calculator;
import functions.*;

public class Calculator {

	public int add(int i, int j) {
		Adder adder = new Adder();
		return adder.add(i,j);
	}

	public int subtract(int i, int j) {
		Subtractor subtractor = new Subtractor();
		return subtractor.subtract(i,j);
	}

	public double divide(int i, int j) {
		Divider divider = new Divider();
		return divider.divide(i,j);
	}

	public int mult(int i, int j) {
		Multiplier multiplier = new Multiplier();
		return multiplier.multiply(i,j);
	}
}
