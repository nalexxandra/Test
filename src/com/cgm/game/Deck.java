package com.cgm.game;

import java.util.Random;

import com.cgm.game.Card.CardValue;
import com.cgm.game.Card.Suit;

public class Deck {
	
	private Card[] deck;
    
    public Deck() 
    {
    	deck = new Card[52];
    	int i=0;
        for(Suit s: Suit.values())
        {
        	for(CardValue cv: CardValue.values())
        	{
        		deck[i++]=new Card(cv,s);
        	}
        }
    }
    
    public Deck(int n)
    {
    	deck = new Card[n];
    	for(int i=0;i<n;i++)
    	{
	    	Suit s = Suit.values()[new Random().nextInt(Suit.values().length)];
	    	CardValue cv = CardValue.values()[new Random().nextInt(CardValue.values().length)];
	    	deck[i]=new Card(cv,s);
    	}
    }
    
    public Card[] getDeck()
    {
        return deck;
    }

    public void setDeck(Card[] deck)
    {
        this.deck = deck;
    }

}
