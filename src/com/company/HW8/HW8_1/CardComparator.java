package com.company.HW8.HW8_1;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        int ret = o1.getSuit ().ordinal () - o2.getSuit ().ordinal ();
        if (ret == 0)
            return o1.getValue ().ordinal () - o2.getValue ().ordinal ();
        return ret;
    }
}
