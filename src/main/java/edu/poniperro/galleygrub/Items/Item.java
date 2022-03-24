package edu.poniperro.galleygrub.Items;

public abstract class Item<object> implements Product{
    String name;
    Double price;
    String extra;

    public Item(String name,Double price,String extra) {
        this.name = name;
        this.extra = extra;
        this.price = price;

    }

    public String name() {
        return null;
    }
    @Override
    public abstract Double price();

    public abstract String extra();

    @Override
    public Boolean isRegular() {
        return null;
    }
    public abstract String toString();

    public final Boolean equals(object) {

        return null;
    }

    public int hashCode() {
        return 0;
    }



}
