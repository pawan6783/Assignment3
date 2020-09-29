package com.example.Assignment3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ReverseStringTest {

	ReverseString rs = null;
	
	@Before
	public void setUp() {
		rs = new ReverseString();
	}
	
	@Test
	public void test1() {
		String str = "Hey fellow warriors";
		String result = "Hey wollef sroirraw";
		assertEquals(result, rs.reverseString(str));
	}
	
	@Test
	public void test2() {
		String str = "This is a test";
		String result = "This is a test";
		assertEquals(result, rs.reverseString(str));
	}
	
	
	@Test
	public void test3() {
		String str = "Hey fellow warriors";
		String result = "";
		assertEquals(result, rs.reverseString(str));
	}
	
	@Test
	public void test4() {
		String str = "You are almost to the last test";
		String result = "You are tsomla to the last test";
		assertEquals(result, rs.reverseString(str));
	}
	
	@Test
	public void test5() {
		String str = "Seriously this is the last one";
		String result = "ylsuoireS this is the last one";
		assertEquals(result, rs.reverseString(str));
	}

}
