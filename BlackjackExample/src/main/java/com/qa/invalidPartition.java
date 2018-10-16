package com.qa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class invalidPartition {
	
	Blackjack b = new Blackjack(); 
	
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
	public void test9() { 
		assertEquals(0,b.blackjackPlay(10, 32));
	}
	@Test
	public void test10() { 
		assertEquals(0,b.blackjackPlay(30, -10));
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