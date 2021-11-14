package pl.edu.agh.kis.pz1;

import java.util.ArrayList;

public class Player {
    private int number;
    private ArrayList<Card> cards;

    public Player(int n){
        this.number = n;
        cards = new ArrayList<>();
    }

    public void showCards(){
        for(Card c: cards)
            c.to_string();
    }

    public int getNumber(){ return number; }

    public void addCard(Deck deck){ this.cards.add(deck.takeACard()); }
}
