package com.qa;

import org.junit.runner.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import org.junit.*;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class newTestz {
	
	Blackjack b = new Blackjack(); 
	
@Parameters 
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{{0,-10,-10},{0,-10,10}, {0,-10,30}, {0,-10,50}, {0,10,0}, {12,10,12}, {12,12,10}}); 
	}
	
private int playerInt;
private int dealerInt;
private int expectedInt;
	
 public newTestz(int expected, int player, int dealer) { 
	expectedInt = expected;
	playerInt = player;
	dealerInt = dealer; 
 }
 
@Test
public void test() { 
	assertEquals(expectedInt, b.blackjackPlay(playerInt, dealerInt));
	}

}
