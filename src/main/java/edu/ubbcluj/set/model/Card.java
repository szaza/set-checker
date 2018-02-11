package edu.ubbcluj.set.model;

import edu.ubbcluj.set.util.CardUtil;

import java.util.Objects;

public class Card {

    /* 0-red, 1-green, 2-purple */
    private Byte color;
    /* 0-croissant, 1-diamond, 2-oval */
    private Byte shape;
    /* 0-blank, 1-striped, 2-filled*/
    private Byte fill;
    private Byte number;

    public Byte getColor() {
        return color;
    }

    public void setColor(Byte color) {
        this.color = color;
    }

    public Byte getShape() {
        return shape;
    }

    public void setShape(Byte shape) {
        this.shape = shape;
    }

    public Byte getFill() {
        return fill;
    }

    public void setFill(Byte fill) {
        this.fill = fill;
    }

    public Byte getNumber() {
        return number;
    }

    public void setNumber(Byte number) {
        this.number = number;
    }

    public Byte getAttrByCategoryIndex(final int index) {
        switch (index) {
            case 0: return getNumber();
            case 1: return getColor();
            case 2: return getFill();
            case 3: return getShape();
            default: return null;
        }
    }

    @Override
    public boolean equals(Object obj) {
        Card other = (Card) obj;
        return this.getNumber().equals(other.getNumber())
                && this.getColor().equals(other.getColor())
                && this.getFill().equals(other.getFill())
                && this.getShape().equals(other.getShape());
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, shape, fill, number);
    }

    @Override
    public String toString() {
        return "Card{" + (this.getNumber()+1) +
                "-" + CardUtil.convertToColor(color) +
                "-" + CardUtil.convertToFill(fill) +
                "-" + CardUtil.convertToShape(shape) +
                '}';
    }
}
