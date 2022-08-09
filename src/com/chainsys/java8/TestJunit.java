package com.chainsys.java8;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestJunit {
	@Test
	public void testMethods() {
		int add = JUnitEx.add(3, 6);
		assertEquals(9, add);
	}

	@Test
	public void testMethods1() {
		int add = JUnitEx.add(-3, 6);
		assertEquals(3, add);
	}

	@Test
	public void testMethods2() {
		int add = JUnitEx.add(3, 0);
		assertEquals(3, add);
	}

	@Test
	public void testMethods4() {
		String name = JUnitEx.display("Abin");
		assertEquals("Abinaya", name);
	}

	@Test
	public void testMethods5() {
		boolean displayName = JUnitEx.displayName("Anuradha");
		assertTrue(displayName);
	}

	TestMobile m = new TestMobile();

	@Test
	public void test() {
		String string = m.mobileValidation("1234567891");
		assertEquals("1234567891", string);
	}

}
