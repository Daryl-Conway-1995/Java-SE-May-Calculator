package com.qa.calculator;
import functions.*;

public class Calculator {

	public int add(int i, int j) {
		Add add = new Add();
		return add.add(i,j);
	}

	public int minus(int i, int j) {
		Minus minus = new Minus();
		return minus.minus(i,j);
	}

	public double divide(int i, int j) {
		Divide divide = new Divide();
		return divide.divide(i,j);
	}

	public int mult(int i, int j) {
		Multiply multiply = new Multiply();
		return multiply.multiply(i,j);
	}
}
