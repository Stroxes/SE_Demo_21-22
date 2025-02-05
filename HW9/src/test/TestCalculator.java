package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Calculator;


class TestCalculator {
	
	Calculator calculator = new Calculator();
	
	@Test
	public void Should_add_two_numbers_and_return_result() {
		// Implement
		assertEquals(2, calculator.add(1, 1));
		
	}

	@ParameterizedTest
	@CsvSource({"1, 2"})
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		assertEquals(3,calculator.add(valueOne, valueTwo));
		
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		// Implement
		assertEquals(1, calculator.sub(2, 1));
		
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		// Implement
		assertEquals(4, calculator.multiply(2, 2));
		
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		
		assertEquals(1, calculator.divide(2, 2));
		
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		ArrayIndexOutOfBoundsException exception = assertThrows(ArrayIndexOutOfBoundsException.class, () ->{
			calculator.divide(1, 0);
		}, "ArrayIndexOutOfBoundsException was expected");
       
		assertTrue(exception.getMessage().contains("ZeroDivisionError"));
		//assertEquals("ZeroDivisionError",  calculator.divide(1, 0));
	}
	
}
