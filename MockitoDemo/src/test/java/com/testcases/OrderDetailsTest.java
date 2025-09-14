package com.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.bookapp.service.IBookService;
import com.bookapp.service.OrderDetails;

class OrderDetailsTest {
	
	@Mock
	IBookService bookService; // create a mock/proxy of IBookService
	@InjectMocks
	OrderDetails orderDetails; //attach IBookService obj

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		orderDetails = new OrderDetails();
		//attach IBookService obj
//		orderDetails.setBookService(bookService);
	}

	@AfterEach
	void tearDown() throws Exception {
		orderDetails = null;
	}

	@Test
	void testgetTitlesByAuthor() {
		String author = "Kathy";
		List<String> actual = orderDetails.getTitlesByAuthor(author);
		assertEquals(Arrays.asList("Java","React"), actual);
	}

}










