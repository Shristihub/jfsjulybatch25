package com.testcases.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.trial.examples.Calculator;

class CalculatorTest {
	
	Calculator calculator;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("called before all testcases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("called after all testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("called before each testcases");
		//create the calculator object- fresh copy for every test
		calculator = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("called after each testcases");
		//nullify the calculator ref
		calculator = null;
	}

	@Test
	@Disabled
	@DisplayName("Testing  Sum method")
	void testSum() {
		int actual = calculator.sum(10, 20);
		assertEquals(30,actual);
	}

	@Test
	@DisplayName("Testing Product method")
	void testProduct() {
		int actual = calculator.product(2,2);
		assertEquals(4,actual);
		actual = calculator.product(2,3);
		assertEquals(6,actual);
	}

}
