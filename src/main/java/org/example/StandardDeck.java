package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StandarDeck implements Deck{

    List<Card> cards;

    public StandarDeck(){
        this.cards = newDeck();
    }

    private List<Card> newDeck() {
        List<Card> newDeck = new ArrayList<>();

        Arrays.stream(Suit.values()).forEach(suit -> {

            Arrays.stream(FaceValue.values()).map(facevalue -> new Card(suit, facevalue)).forEach(newDeck::add);

        });

        return newDeck;
    }

    public List<Card> getCards() {
        return cards;
    }

    @Override
    public void cut(int index) {

        List<Card> top = this. cards.subList(0, index);
        List<Card> bottom = this. cards.subList(index +1, this.cards.size());

        this.cards.clear();

        this.cards.addAll(bottom);
        this.cards.addAll(top);
    }

    @Override
    public Card deal() {
        return this.cards.remove(0);
    }

    @Override
    public void newOrder(Deck cards) {
        Collections.sort(this.cards);
    }

    @Override
    public int search(Card card) {
        return this.cards.indexOf(card);
    }

    @Override
    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    @Override
    public int size() {

        return this.cards.size();
    }

    @Override
    public Card turnOver() {
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StandarDeck{");
        sb.append(cards);
        sb.append('}');
        return sb.toString();
    }
}