package com.qa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class bustPartition {
	
	Blackjack b = new Blackjack(); 
	
	@Test
	public void test8() { 
		assertEquals(10,b.blackjackPlay(10, 22));
	}
	@Test
	public void test11() {
		assertEquals(10,b.blackjackPlay(30, 10));
	}
	@Test
	public void test12() { 
		assertEquals(0,b.blackjackPlay(30, 30));
	}

}
