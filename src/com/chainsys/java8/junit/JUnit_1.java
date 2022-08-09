package com.chainsys.java8.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class JUnit_1 {
	@Test
	public void setup() {
		String name = "Nithin";
		assertEquals("Nithin", name);
	}
}
