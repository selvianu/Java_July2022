package com.chainsys.java8.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestAddition3 {

	// test method to add two values
	@Test
	public void testAdd() {
		String actualResult = Addition.getFullName("Selvi", "T");
		assertEquals("Selvi T", actualResult);
	}

	@Test
	public void testAdd2() {
		String actualResult = Addition.getFullName("Selvi", "");
		assertEquals("Selvi ", actualResult);
	}

	@Test
	public void testAdd3() {
		String actualResult = Addition.getFullName("", "");
		assertEquals(" ", actualResult);
	}
}
