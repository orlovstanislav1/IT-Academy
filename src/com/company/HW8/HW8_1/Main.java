package com.company.HW8.HW8_1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList cards = new ArrayList ();

        Card card1 = new Card ( Value.QUEEN, Suit.HEARTS );
        cards.add ( card1 );
        Card card2 = new Card ( Value.JACK, Suit.DIAMONDS );
        cards.add ( card2 );
        Card card3 = new Card ( Value.SIX, Suit.SPADES );
        cards.add ( card3 );
        Card card4 = new Card ( Value.SIX, Suit.CLUBS );
        cards.add ( card4 );

        Card card5 = new Card ( Value.SEVEN, Suit.HEARTS );
        cards.add ( card5 );
        Card card6 = new Card ( Value.SIX, Suit.DIAMONDS );
        cards.add ( card6 );
        Card card7 = new Card ( Value.TEN, Suit.SPADES );
        cards.add ( card7 );
        Card card8 = new Card ( Value.KING, Suit.CLUBS );
        cards.add ( card8 );

        Card card9 = new Card ( Value.SEVEN, Suit.HEARTS );
        cards.add ( card9 );
        Card card10 = new Card ( Value.SIX, Suit.DIAMONDS );
        cards.add ( card10 );
        Card card11 = new Card ( Value.TEN, Suit.SPADES );
        cards.add ( card11 );
        Card card12 = new Card ( Value.KING, Suit.CLUBS );
        cards.add ( card12 );

        System.out.println ( "имеются карты " + cards );

        Comparator SuitComparator = new CardComparator ();
        Collections.sort ( cards, SuitComparator );
        System.out.println ( "отсортировали " + cards );

        Collections.shuffle ( cards );
        System.out.println ( "перемешали " + cards );

        HashSet<?> setCards = new HashSet<> ( cards );
        System.out.println ( "без дублей " + setCards );

        Map<Suit, List<Card>> map = new HashMap<> ();

        map.put ( Suit.HEARTS, new ArrayList<Card> () );
        map.put ( Suit.DIAMONDS, new ArrayList<Card> () );
        map.put ( Suit.CLUBS, new ArrayList<Card> () );
        map.put ( Suit.SPADES, new ArrayList<Card> () );

        Iterator iterator = setCards.iterator ();

        while (iterator.hasNext ()) {
            Card tempCard = (Card) iterator.next ();
            List<Card> tempList = map.get ( tempCard.getSuit () );
            tempList.add ( tempCard );
        }
        System.out.println ( "По мастям:" + map );
    }
}
