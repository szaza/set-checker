package edu.ubbcluj.set.model;

import java.util.LinkedHashSet;

import static edu.ubbcluj.set.config.Config.COLS;
import static edu.ubbcluj.set.config.Config.ROWS;

public class Grid {
    private LinkedHashSet<Card> grid;

    public Grid(LinkedHashSet<Card> cards) {
        this.grid = cards;
    }

    public LinkedHashSet<Card> getGrid() {
        return grid;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Card[] cards = grid.toArray(new Card[]{});

        stringBuilder.append("THE GRID");
        stringBuilder.append(System.getProperty("line.separator"));

        for (int y=0; y<ROWS; y++) {
            stringBuilder.append("-----------------------------------------------------------------------------------------");
            stringBuilder.append(System.getProperty("line.separator"));
            for (int x=0; x<COLS; x++) {
                stringBuilder.append(cards[x + y * 3]);
                stringBuilder.append(" | ");
            }
            stringBuilder.append(System.getProperty("line.separator"));
        }

        return stringBuilder.toString();
    }
}
