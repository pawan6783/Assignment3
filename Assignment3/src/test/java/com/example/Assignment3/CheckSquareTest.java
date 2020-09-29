package com.example.Assignment3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CheckSquareTest {

	CheckSquare cs = null;
	
	@Before
	public void setUp() {
		cs = new CheckSquare();
	}
	
	@Test
	public void Test1() {
		assertEquals(false, cs.isSquare(-1));
	}
	
	@Test
	public void Test2() {
		assertEquals(true, cs.isSquare(0));
	}
	
	@Test
	public void Test3() {
		assertEquals(false, cs.isSquare(3));
	}
	
	@Test
	public void Test4() {
		assertEquals(true, cs.isSquare(4));
	}
	
	@Test
	public void Test5() {
		assertEquals(true, cs.isSquare(25));
	}
	
	@Test
	public void Test6() {
		assertEquals(false, cs.isSquare(26));
	}
}
