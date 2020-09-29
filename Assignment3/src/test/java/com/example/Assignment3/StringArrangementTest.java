package com.example.Assignment3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class StringArrangementTest {

	StringArrangement sa = null;
	
	@Before
	public void setUp() {
		sa = new StringArrangement();
	}
	
	@Test
	public void test1() {
		String str = "is2 Thi1s T4est 3a";
		String result = "Thi1s is2 3a T4est";
		assertEquals(result, sa.arrangeString(str));
	}
	
	@Test
	public void test2() {
		String str = "4of Fo1r pe6ople g3ood th5e the2";
		String result = "Fo1r the2 g3ood 4of th5e pe6ople";
		assertEquals(result, sa.arrangeString(str));
	}
	
	@Test
	public void test3() {
		String str = "";
		String result = "";
		assertEquals(result, sa.arrangeString(str));
	}
	
}
