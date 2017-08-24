package com.cgm.game;

public class Card {

	
    public enum Suit{ SPADES, HEARTS, DIAMONDS, CLUBS; }
    public enum CardValue{ TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, ACE, JACK, QUEEN, KING; }
   
    private Suit suit;
    private CardValue cardValue;
    
    public Card (CardValue cardValue, Suit suit)
    {
        this.cardValue = cardValue;
        this.suit = suit;
    }

    public Suit getSuit()
    {
        return suit;
    }

    public void setSuit(Suit suit)
    {
        this.suit = suit;
    }

    public CardValue getCardValue()
    {
        return cardValue;
    }

    public void setCardValue(CardValue cardValue)
    {
        this.cardValue = cardValue;
    }
 
	public String toString() {
		return new StringBuilder().append(this.getCardValue()).append(" of ").append(this.getSuit()).toString();
	}
}
