package org.dtu.matador.game;

public abstract class NonPurchaseableFields implements FieldSpaces {

    String propertyName;
    String subtext;
    String description;
    int rent;
    String color_1;
    String color_2;

    public String print() {
        return "Well hello there";
    }
    public void printOther() {
        System.out.println("Well hello there, Other");
    }

    public String getName() {
        return this.propertyName;
    }

    public String getSubtext() {
        return this.subtext;
    }

    public String getDescription() {
        return this.description;
    }

    public String getColor_1() {
        return this.color_1;
    }

    public String getColor_2() {
        return this.color_2;
    }

}
