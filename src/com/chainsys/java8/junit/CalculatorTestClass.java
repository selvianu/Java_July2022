package com.chainsys.java8.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class CalculatorTestClass {
	
	@Test
	public void testAddition() {
		// valid testCase
		int sum = Caculator.addition(5, 6);
		assertEquals(11, sum);
	}

	@Test
	public void testAddition1() {
		// invalid test case
		int sum = Caculator.addition(5, 6);
		assertNotEquals(13, sum);
	}

	@Test
	public void testAddition2() {
		// valid test case
		int sum = Caculator.addition(-5, 6);
		assertEquals(1, sum);
	}

	@Test
	public void testAddition3() {
		int sum = Caculator.addition(5, 0);
		assertEquals(5, sum);
	}

	@Test
	public void testProduct1() {
		int product = Caculator.product(2, 4);
		assertEquals(8, product);
	}

	@Test
	public void testProduct2() {
		assertEquals(0, Caculator.product(2, 0));
	}

	@Test
	public void testgreaterNo() {
		int greaterNumber = Caculator.greaterNumber(34, 40);
		assertEquals(40, greaterNumber);
	}

	@Test
	public void testName() {
		assertTrue(Caculator.getFullName("Nishara"), "True");

	}

	@Test
	public void testName1() {
		assertTrue(Caculator.getFullName("Neha"));

	}

	@Test
	public void testName2() {
		assertFalse(Caculator.getFullName("Neha"));

	}

	@Test
	public void cabPrice() {
		int cabFare = Caculator.getCabFare("mini", 10);
		assertEquals(150, cabFare);

	}

}
