package edu.neumont.cs180.rosado.jose;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private Calculator calculator;
	
	@org.junit.jupiter.api.BeforeEach
	void setup() {
		calculator = new Calculator();
	}
	
	@org.junit.jupiter.api.AfterEach
	void tearDown() {
		
	}
	
	@Test
	public void should_add_two_numbers() {
		//arrange
		calculator = new Calculator();
		double expected = 16;
		//act
		double answer = calculator.add(13.5, 2.5);
		//assert
		assertEquals(expected, answer);
	}
	
	@Test
	public void should_subtract_two_numbers() {
		//arrange
		calculator = new Calculator();
		double expected = 10;
		//act
		double answer = calculator.subtract(13.5, 10.5);
		//assert
		assertEquals(expected, answer);
	}
	
	@Test
	public void should_multiply_two_numbers() {
		//arrange
		calculator = new Calculator();
		double expected = 27;
		//act
		double answer = calculator.multiply(13.5, 2);
		//assert
		assertEquals(expected, answer);
	}
	
	@Test
	public void should_divide_two_numbers() {
		//arrange
		calculator = new Calculator();
		double expected = 4.5;
		//act
		double answer = calculator.divide(13.5, 3);
		//assert
		assertEquals(expected, answer);
	}
}
