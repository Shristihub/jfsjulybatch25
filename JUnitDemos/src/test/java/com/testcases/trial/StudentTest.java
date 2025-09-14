package com.testcases.trial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.trial.examples.Student;
import com.trial.exceptions.InvalidNumException;

@Tag("student")
class StudentTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	Student student;
	@BeforeEach
	void setUp() throws Exception {
		student = new Student();
	}

	@AfterEach
	void tearDown() throws Exception {
		student = null;
	}

	@Test
	@DisplayName("Testing positive values")
	@Tag("simple")
	void testCalcSum() {
		int actual = student.calcSum(90,80, 92);
		assertEquals(262,actual, "expected 262");
	}
	
	@Test
	@DisplayName("Testingneg values")
	void testCalcSumNeg() {
		assertThrows(InvalidNumException.class, ()->student.calcSum(90,80,-92));
	}
	@Test
	@DisplayName("Testing values greater than hundred")
	void testCalcSumGreater() {
		assertThrows(InvalidNumException.class, ()->student.calcSum(90,80,192));
	}

	

}










