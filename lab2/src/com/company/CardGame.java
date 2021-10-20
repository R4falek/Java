package com.company;

import java.util.ArrayList;

public class CardGame {
    private ArrayList<Player> players;
    private int numberOfPlayers;
    private int cardsPerPlayer;
    private Deck deck;

    public CardGame(int p, int cpp){
        this.players = new ArrayList<>();
        this.numberOfPlayers = p;
        this.cardsPerPlayer = cpp;
        this.deck = new Deck();
        this.deck.shuffle();
    }

    public void start() {
        for (int i = 0; i < this.numberOfPlayers; i++) {
            Player player = new Player(i + 1);
            for(int j = 0; j < cardsPerPlayer; j++)
                player.addCard(this.deck);
            this.players.add(player);
        }
    }

    public void show(){
        for(Player p: this.players){
            System.out.println("Player " + p.getNumber());
            p.showCards();
        }
    }
}
