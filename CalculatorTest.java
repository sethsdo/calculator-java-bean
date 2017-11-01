package com.codingdojo.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator addition = new Calculator(10, "+", 22);
		Calculator subtraction = new Calculator(10, "-", 22);
		System.out.println(addition.getResults());
		System.out.println(subtraction.getResults());

	}

}
