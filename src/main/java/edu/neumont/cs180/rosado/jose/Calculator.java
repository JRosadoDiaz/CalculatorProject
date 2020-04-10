package edu.neumont.cs180.rosado.jose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Calculator {
	
	private double answer = 0;
	
	public double add(double num1, double num2) {
		answer = num1 + num2;
		return answer;
	}
	
	public double subtract(double num1, double num2) {
		answer = num1 - num2;
		return answer;
	}
	
	public double multiply(double num1, double num2) {
		answer = num1 * num2;
		return answer;
	}
	
	public double divide(double num1, double num2) {
		answer = num1 / num2;
		return answer;
	}
}
