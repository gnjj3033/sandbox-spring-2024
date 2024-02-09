package org.example;

public class DeckDriver {

    public static void main(String[] args) {

        public static void main(String[] args) {
            Deck cards = new StandarDeck();
            displayDeck(cards);

            cards.shuffle();
            displayDeck(cards);

            System.out.println(cards.size());
            cards.cut(1);
            displayDeck(cards);
            System.out.println(cards.size());
        }

        private static void displayDeck(Deck cards) {
            System.out.println("Cards");
        }
}
