package com.testcases.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.trial.examples.User;

class UserTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	User user;
	@BeforeEach
	void setUp() throws Exception {
		user = new User();
	}

	@AfterEach
	void tearDown() throws Exception {
		user = null;
	}

	
//	@Test
//	@DisplayName("Test Name - not null")
//	void testPrintName() {
//		assertNotNull(student.printName("Priya"));
//	}
	
	@Test
	@DisplayName("Test Name - uppercase")
	@Tag("simple")
	void testPrintNameUpper() {
		assertEquals("PRIYA", user.printName("Priya"));
	}
	
	@Test
	@DisplayName("Test Name - null")
	void testPrintName() {
		assertNull(user.printName(null));
	}

	

}










