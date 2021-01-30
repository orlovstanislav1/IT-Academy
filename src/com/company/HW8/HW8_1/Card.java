package com.company.HW8.HW8_1;

import java.util.Objects;

public class Card implements Comparable<Card> {
    private Value value;
    private Suit suit;


    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Card card = (Card) o;
        return value == card.value &&
                suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash ( value, suit );
    }

    @Override
    public String toString() {
        return "Card{" +
                value + " " + suit +
                '}';
    }

    @Override
    public int compareTo(Card o) {
        return 0;
    }
}
