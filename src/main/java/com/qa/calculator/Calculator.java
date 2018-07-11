package com.qa.calculator;
import functions.*;

public class Calculator {

	public int add(int i, int j) {
		Adder add = new Adder();
		return add.add(i,j);
	}

	public int subtract(int i, int j) {
		Subtractor subtract = new Subtractor();
		return subtract.subtract(i,j);
	}

	public double divide(int i, int j) {
		Divider divide = new Divider();
		return divide.divide(i,j);
	}

	public int mult(int i, int j) {
		Multiplier multiply = new Multiplier();
		return multiply.multiply(i,j);
	}
}
