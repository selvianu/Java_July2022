package com.chainsys.java8.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class TestAddition {

	
	   // test method to add two values
		@Test
	   public void testAdd(){
	      int actualResult = Addition.add(2, 3);
	      assertEquals(5, actualResult);
	   }
		
		@Test
		   public void testAdd2(){
		      int actualResult = Addition.add(-2, -3);
		      assertEquals(-5, actualResult);
		   }

		@Test
		   public void testAdd3(){
		      int actualResult = Addition.add(2, 0);
		      assertEquals(2, actualResult);
		   }
}
