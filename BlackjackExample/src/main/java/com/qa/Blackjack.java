package com.qa;

public class Blackjack {
	
	static void main(String [] args) {	
	}
	
	public int blackjackPlay(int player, int dealer) { 
		if (player <= 0 || dealer <= 0) {
			return 0;
		}
		else if (player >= 32 || dealer >= 32) {
			return 0;
		}
		else if ((player > 0 && player <= 21) && (dealer >= 0 && dealer <= 21) && (player > dealer)) {
			return player;
		}
		else if ((player > 0 && player <= 21) && (dealer >= 0 && dealer <= 21) && (dealer > player)) { 
			return dealer;
		}
		else if ((player > 21 && player <= 31) && (dealer >= 0 && dealer <= 21)) {
				System.out.println("Player bust");
				return dealer;
		}
		else if ((dealer > 21 && dealer <= 31) && (player >= 0 && player <= 21)) {
				System.out.println("Dealer bust");
				return player;
		}	
		else { 
		return 0;
		}
	}

}
