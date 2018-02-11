package edu.ubbcluj.set.util;

public final class AttributeConverter {

    public static String convertToCategory(int attribute) {
        switch (attribute) {
            case 0: return "Number";
            case 1: return "Color";
            case 2: return "Fill";
            case 3: return "Shape";
            default: return "Unknown";
        }
    }

    public static String convertToAttr(int attribute, byte value) {
        switch (attribute) {
            case 0: return (value + 1) + "";
            case 1: return CardUtil.convertToColor(value);
            case 2: return CardUtil.convertToFill(value);
            case 3: return CardUtil.convertToShape(value);
            default: return "Unknown";
        }
    }

}
