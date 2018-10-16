package com.qa;

import static org.junit.Assert.*;
import org.junit.*;

import org.junit.Test;

public class blackjackTest { 
	
	Blackjack b = new Blackjack();
	static int i=1;
	
	@BeforeClass 
	public static void setup() { 
		System.out.println("Welcome to tests");
	}
	
	@Before 
	public void initialise() {  
		System.out.println("Test " + i + "/17");
	}
	
	@After 
	public void counter() { 
		i++; 
	}
	
	@AfterClass
	public static void teardown() {
		System.out.println("Test class complete");
	}
	@Test
	public void test1() { 
		assertEquals("2 low invalid entries",0,b.blackjackPlay(-10, -10)); 
	}
	@Test
	public void test2() {
		assertEquals(0,b.blackjackPlay(-10, 10));
	}
	@Test
	public void test3() { 
		assertEquals(0,b.blackjackPlay(-10, 30));
	}
	@Test
	public void test4() {
		assertEquals(0,b.blackjackPlay(-10, 50));
	}
	@Test 
	public void test5() { 
		assertEquals(0,b.blackjackPlay(10, 0));
	}
	@Test 
	public void test6() { 
		assertEquals(12,b.blackjackPlay(10, 12));
	}
	@Test 
	public void test7() {
		assertEquals(12,b.blackjackPlay(12, 10));
	}
	@Test
	public void test8() { 
		assertEquals(10,b.blackjackPlay(10, 22));
	}
	@Test
	public void test9() { 
		assertEquals(0,b.blackjackPlay(10, 32));
	}
	@Test
	public void test10() { 
		assertEquals(0,b.blackjackPlay(30, -10));
	}
	@Test
	public void test11() {
		assertEquals(10,b.blackjackPlay(30, 10));
	}
	@Test
	public void test12() { 
		assertEquals(0,b.blackjackPlay(30, 30));
	}
	@Test
	public void test13() {
		assertEquals(0,b.blackjackPlay(30, 50));
	}
	@Test
	public void test14() { 
		assertEquals(0,b.blackjackPlay(35, -10));
	}
	@Test
	public void test15() { 
		assertEquals(0,b.blackjackPlay(35, 10));
	}
	@Test 
	public void test16() { 
		assertEquals(0,b.blackjackPlay(35, 25));
	}
	@Test
	public void test17() {
		assertEquals(0,b.blackjackPlay(35, 50));
	}
}
