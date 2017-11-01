package com.codingdojo.calculator;

class Calculator implements java.io.Serializable {
	private int operandOne;
	private int operandTwo;
	private String operation;
	private int results;
	
	public Calculator() {}
	
	public Calculator (int operandOne, String operation, int operandTwo) {
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
		this.operation = operation;
		if (operation == "-") {
			this.results = (operandOne -= operandTwo);
		}
		else if (operation == "+") {
			this.results = (operandOne += operandTwo);
		}
		else {
			System.out.println("There was an error.");
		}
	}
	
	public int getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(int operandOne) {
		this.operandOne = operandOne;
	}
	public int getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(int operandTwo) {
		this.operandTwo = operandTwo;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public void setResults(int operandOne, String operation, int operandTwo) {
		if (operation == "-") {
			this.results = (operandOne -= operandTwo);
		}
		else if (operation == "+") {
			this.results = (operandOne += operandTwo);
		}
		else {
			System.out.println("There was an error.");
		}
	}
	public int getResults() {
		return this.results;
	}
	

}
