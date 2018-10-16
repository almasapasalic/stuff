package com.qa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class normalPartition {
	
	Blackjack b = new Blackjack(); 
	
	@Test 
	public void test6() { 
		assertEquals(12,b.blackjackPlay(10, 12));
	}
	@Test 
	public void test7() {
		assertEquals(12,b.blackjackPlay(12, 10));
	}

}
