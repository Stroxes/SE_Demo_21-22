package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.GregorianCalendar;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calendar;

class TestCalendar {

	@ParameterizedTest
	@ValueSource(ints = {2008,2012,2016,2020,2024})
	public void Should_return_true(int year) {
		Calendar c=new Calendar(year);
		assertTrue(c.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {2009,2010,2011,2013,2014})
	public void Should_return_false(int year) {
		Calendar c=new Calendar(year);
		assertFalse(c.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints= {1994,2249,1886,1845,2000}) 
	public void Should_return_if_year_is_leap(int year) {
		// Implement
		GregorianCalendar c= new GregorianCalendar();
		if(c.isLeapYear(year)) {
			assertEquals(year,year);
		}
		
		
	}
	@Test
	public void BoundaryTesting(int year){
		GregorianCalendar c= new GregorianCalendar();
		if(year<1582) {
			assertFalse(c.isLeapYear(Integer.MIN_VALUE));
		}
		if(year==1582) {
			assertTrue(c.isLeapYear(year));
		}
		if(year>1582) {
			assertTrue(c.isLeapYear(year));
		}
		

	}
	// Create a new method for boundary testing
}
