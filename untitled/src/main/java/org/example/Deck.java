package org.example;

import java.util.ArrayList;

/**
 * The Deck class implements the deck of cards using Card class
 *
 * @author  Rafał
 * @version 1.0
 */

public class Deck {
    /**
     * deck of cards
     */
    private ArrayList<Card> cards;

    /**
     * constructor
     */
    public Deck(){
        this.cards = new ArrayList<>();

        for(int i = 0 ; i < 4 ; i++)
            for(int j = 0 ; j < 13 ; j++){
                Card card = new Card(Card.Suit.values()[i], Card.Rank.values()[j]);
                cards.add(card);
            }
    }

    /**
     * returns suit and rank for every card in a deck
     */
    public void getDeck(){
        for(Card c: this.cards)
            System.out.println(c.getSuit() + " " + c.getRank());
    }

    /**
     * sorts cards by rank and suit
     */
    public void fabryki(){
        ArrayList<Card> sortedDeck = new ArrayList<>();

        while(this.cards.size() != 0){
            Card i = this.cards.get(0);
            for(Card c: this.cards)
                if(i.compare(c) < 0)
                    i = c;
            sortedDeck.add(i);
            this.cards.remove(i);
        }
        this.cards = sortedDeck;
    }


    /**
     * shuffles the deck
     */
    public void shuffle(){
        ArrayList<Card> shuffledDeck = new ArrayList<>();

        while(this.cards.size() != 0){
            int i = (int)(Math.random() * this.cards.size());
            shuffledDeck.add(this.cards.get(i));
            this.cards.remove(i);
        }
        this.cards = shuffledDeck;
    }

    /**
     * takes a card from the top and returns it
     */
    public Card takeACard(){
        Card card = this.cards.get(0);
        this.cards.remove(0);
        return card;
    }
}