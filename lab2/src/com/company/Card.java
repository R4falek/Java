package com.company;

import java.util.Objects;

public class Card {

    public enum Suit{
        PIK(1), TREFL(2), KIER(3), KARO(4);

        private int suit;

        private Suit(int value){
            this.suit = value;
        }
    }

    public enum Rank
    {
        TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);

        private int rank;

        private Rank (int value)
        {
            this.rank = value;
        }
    }

    private Suit suit;
    private Rank rank;

    public Card(Suit s, Rank r){
        this.suit = s;
        this.rank = r;
    }

    public void to_string(){
        System.out.println(this.suit + " "+ this.rank);
    }

    public Suit getSuit(){ return this.suit; }
    public Rank getRank(){ return this.rank; }

    public int compare(Card another){
        if(this.suit.compareTo(another.getSuit()) > 0)
            return 1;
        if(this.suit.compareTo(another.getSuit()) < 0)
            return -1;
        if(this.suit.compareTo(another.getSuit()) == 0){
            if(this.rank.compareTo(another.getRank()) > 0)
                return 1;
            if(this.rank.compareTo(another.getRank()) < 0)
                return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit == card.suit && rank == card.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }
}
