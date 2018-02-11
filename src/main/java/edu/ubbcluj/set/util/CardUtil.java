package edu.ubbcluj.set.util;

import edu.ubbcluj.set.model.Card;
import edu.ubbcluj.set.model.SetOfCards;

import java.util.List;

import static edu.ubbcluj.set.config.Config.CATEGORY_NR;
import static edu.ubbcluj.set.config.Config.COLS;

public final class CardUtil {
    public static String convertToColor(final Byte color) {
        switch (color) {
            case 0: return "red";
            case 1: return "green";
            case 2: return "purple";
            default: return "unknown";
        }
    }

    public static String convertToShape(final Byte shape) {
        switch (shape) {
            case 0: return "croissant";
            case 1: return "diamond";
            case 2: return "oval";
            default: return "unknown";
        }
    }

    public static String convertToFill(final Byte fill) {
        switch (fill) {
            case 0: return "blank";
            case 1: return "striped";
            case 2: return "filled";
            default: return "unknown";
        }
    }

    /**
     * Checks if the cards form a SET
     * @param soc - to check
     * @param categoryIndex - we check the cards based on this category, so in this category they always form a set
     * @return true if the cards form a SET
     */
    public static boolean isSet(final SetOfCards soc, final int categoryIndex) {
        boolean isSet = true;

        for (int i = 0; i< CATEGORY_NR; i++) {
            if (i == categoryIndex) {
                continue;
            }

            isSet = isSet && isSetByCategory(soc, i);
        }

        return isSet;
    }

    /**
     * Check if the cards form a SET inside a category
     * eg. the color of the cards is the same or is different on each card
     * @param soc
     * @param categoryIndex
     * @return
     */
    private static boolean isSetByCategory(final SetOfCards soc, final int categoryIndex) {
        List<Card> cards = soc.getCards();

        // Checks if an attribute applies for each card eg. all of the is green
        boolean isSameOnEach = true;
        for (int i=1; i<COLS; i++) {
            isSameOnEach = isSameOnEach && cards.get(i).getAttrByCategoryIndex(categoryIndex)
                    .equals(cards.get(i-1).getAttrByCategoryIndex(categoryIndex));
        }

        // Can happen that the attribute differs on each cards eg. their colors is different red, green, purple
        if (!isSameOnEach) {
            return !cards.get(0).getAttrByCategoryIndex(categoryIndex).equals(cards.get(1).getAttrByCategoryIndex(categoryIndex))
                    && !cards.get(1).getAttrByCategoryIndex(categoryIndex).equals(cards.get(2).getAttrByCategoryIndex(categoryIndex))
                    && !cards.get(0).getAttrByCategoryIndex(categoryIndex).equals(cards.get(2).getAttrByCategoryIndex(categoryIndex));
        }

        return true;
    }
}
