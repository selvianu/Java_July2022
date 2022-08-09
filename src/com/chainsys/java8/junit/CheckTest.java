package com.chainsys.java8.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CheckTest {
	@Test
	public void test() {
		String display = Check.display("Selvam");
		assertEquals("Selvam", display);

	}

	Calc c = new Calc();

	public int add(int no) {
		c.setNo(no);
		return no + no;
	}
	
	
}
