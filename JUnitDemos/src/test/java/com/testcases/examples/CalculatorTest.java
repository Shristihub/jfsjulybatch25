package com.testcases.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
//	@Disabled
	@DisplayName("Testing  Sum method")
	@Tag("simple")
	@RepeatedTest(value = 3,name = "{displayName}...{currentRepetition}" )
	void testSum() {
		int actual = calculator.sum(10, 20);
		assertEquals(30,actual);
	}

	@Test
	@DisplayName("Testing Product method")
	@Tag("prod")
	void testProduct() {
		int actual = calculator.product(2,2);
		assertEquals(4,actual);
		actual = calculator.product(2,3);
		assertEquals(6,actual);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2,18,33,66,55})	
	void testIsEven(int number) {
	    assertTrue(calculator.isEven(number));
	}
}
