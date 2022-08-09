package com.chainsys.java8.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CheckTseting {
	CheckTest t = new CheckTest();

	@Test
	public void testadd() {
		int add = t.add(5);
		assertEquals(10, add);
	}

}
