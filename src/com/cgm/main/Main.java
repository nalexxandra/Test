package com.cgm.main;

import com.cgm.game.Card;
import com.cgm.game.Deck;

public class Main {
	
	public static void main(String[] args) 
	{

		Deck deck = new Deck();
        for (Card card: deck.getDeck()) 
        {
        	System.out.println(card.toString());
        }


    }
}
