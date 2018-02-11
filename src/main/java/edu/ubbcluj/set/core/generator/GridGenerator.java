package edu.ubbcluj.set.core.generator;

import edu.ubbcluj.set.model.Card;
import edu.ubbcluj.set.model.Grid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashSet;
import java.util.Random;

import static edu.ubbcluj.set.config.Config.COLS;
import static edu.ubbcluj.set.config.Config.ROWS;

public class GridGenerator {
    private final static Logger LOG = LoggerFactory.getLogger(GridGenerator.class);

    private Random random;

    public GridGenerator() {
        random = new Random();
    }

    public Grid generateGrid() {
        LinkedHashSet<Card> cards = new LinkedHashSet();

        while (cards.size() != ROWS * COLS) {
            Card card = new Card();
            card.setNumber(getRandomValue());
            card.setColor(getRandomValue());
            card.setFill(getRandomValue());
            card.setShape(getRandomValue());

            if (!cards.contains(card)) {
                cards.add(card);
            }
        }

        Grid grid = new Grid(cards);
        LOG.info(grid.toString());

        return grid;
    }

    private Byte getRandomValue() {
        return (byte) (random.nextInt(3));
    }

}
