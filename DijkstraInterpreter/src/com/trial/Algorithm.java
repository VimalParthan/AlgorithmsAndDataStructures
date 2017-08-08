package com.trial;

import java.util.Stack;

public class Algorithm {
	private Stack<String> operationStack;
	private Stack<Double> valueStack;

	public Algorithm() {
		super();
		this.operationStack = new Stack<>();
		this.valueStack = new Stack<>();
	}

	public void interpretExpression(String expression) {

		String[] stringArray = expression.split(" ");
		double firstPopped;
		double secondPopped;
		for (String s : stringArray) {
			if (s.equals("(")) {

			} else if (s.equals("+")) {
				this.operationStack.push(s);
			} else if (s.equals("*")) {
				this.operationStack.push(s);
			} else if (s.equals("-")) {
				this.operationStack.push(s);
			} else if (s.equals("/")) {
				this.operationStack.push(s);
			} else if (s.equals(")")) {
				String poppedOperation = this.operationStack.pop();
				if (poppedOperation.equals("*")) {
					this.valueStack.push(this.valueStack.pop() * this.valueStack.pop());
				} else if (poppedOperation.equals("+")) {
					this.valueStack.push(this.valueStack.pop() + this.valueStack.pop());
				} else if (poppedOperation.equals("-")) {
					firstPopped = this.valueStack.pop();
					secondPopped = this.valueStack.pop();
					this.valueStack.push(secondPopped - firstPopped);
				} else if (poppedOperation.equals("/")) {
					firstPopped = this.valueStack.pop();
					secondPopped = this.valueStack.pop();
					this.valueStack.push(secondPopped / firstPopped);
				}
			} else {
				this.valueStack.push(Double.parseDouble(s));
			}
		}
	}

	public void result() {
		System.out.println(this.valueStack.pop());
	}

}
