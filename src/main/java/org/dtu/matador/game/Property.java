package org.dtu.matador.game;

public abstract class Property implements Properties {

    String propertyName;
    String subtext;
    String description;
    int rent;
    String color_1;
    String color_2;
    String owner;
    boolean purchasable = false;
    int price;
    public Property(String name, String subtext, String description, String rent, String color_1, String color_2, String price, String owner) {
        this.propertyName = name;
        this.subtext = subtext;
        this.description = description;
        this.rent = Integer.parseInt(rent);
        this.price = Integer.parseInt(price);
        this.color_1 = color_1;
        this.color_2 = color_2;
        this.owner = owner;
    }


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

    public boolean getPurchasable() {
        return purchasable;
    }

    public int getPrice() {
        return price;
    }

    public int getRent() {
        return rent;
    }

    public String getOwner() {
        return this.owner;
    }

}
