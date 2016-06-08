package javaProgrammerLevel1.inheritance;

import java.util.*;

public class DisplayDeck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for (int suit = Card2.DIAMONDS; suit <= Card2.SPADES; suit++) {
            for (int rank = Card2.ACE; rank <= Card2.KING; rank++) {
                Card2 card = deck.getCard(suit, rank);
                System.out.format("%s of %s%n",
                    Card2.rankToString(card.getRank()),
                    Card2.suitToString(card.getSuit()));
            }
        }
    }
}
