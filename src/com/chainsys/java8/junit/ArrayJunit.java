package com.chainsys.java8.junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;

public class ArrayJunit {
	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = { 12, 3, 4, 1 };
		int[] expected = { 1, 3, 4, 12 };
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}

	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] numbers = null;
		Arrays.sort(numbers);
	}

	@Test(timeout = 100)
	public void testSort_Performance() {
		int array[] = { 12, 23, 4 };
		for (int i = 1; i <= 1000000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}
	}

	@Test(expected = Exception.class)
	public void testDivisionException() throws Exception {
		Caculator.division(10, 0);
	}

	@Ignore
	@Test
	public void testEqual() {
		boolean result = Caculator.equalIntegers(20, 20);
		assertFalse(result);
	}

	@Test(expected = AssertionError.class)
	public void testSubstraction() {
		int result = 10 - 3;

		assertTrue(result == 9);
	}

}
