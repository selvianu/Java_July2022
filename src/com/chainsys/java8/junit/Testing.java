package com.chainsys.java8.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Testing {
	@Test
	public void check() {
		String fullName = Caculator.getFullName("Revathy", "Ramesh");
		assertEquals("Revathy Ramesh", fullName);

	}
}
