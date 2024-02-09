package org.example;

import java.util.Objects;

public class Card implements Comparable<Card> {

    private Suit suit;
    private FaceValue faceValue;

    private Card() {
    }

    public Card(Suit suit, FaceValue faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public Suit getSuit() {
        return suit;
    }

    public FaceValue getFaceValue() {
        return faceValue;
    }

    @Override
    public int compareTo(Card card) {
        if (this.getSuit().ordinal() > card.getSuit().ordinal()) {
            return 1;
        } else if (this.getSuit().ordinal() < card.getSuit().ordinal()) {
            return -1;
        } else {

            if (this.getFaceValue().ordinal() > card.getFaceValue().ordinal()) {
                return 1;
            } else if (this.getFaceValue().ordinal() > card.getFaceValue().ordinal())
                return -1;
        } else {
            return 0;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit == card.suit && faceValue == card.faceValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, faceValue);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        sb.append(faceValue);
        sb.append(" of ").append(suit);
        sb.append("]");
        return sb.toString();
    }
}