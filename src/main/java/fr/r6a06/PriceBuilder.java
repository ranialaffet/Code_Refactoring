package fr.r6a06;

import java.util.Collections;
import java.util.Vector;

public class PriceBuilder {

    private int priceCode;

    public Price build() {
        Price result;
        switch (priceCode) {
            case Movie.CHILDRENS -> result = new ChildrenPrice();
            case Movie.REGULAR -> result = new RegularPrice();
            case Movie.NEW_RELEASE -> result = new NewReleasePrice();
            default -> result = new RegularPrice();
        }
        return result;
    }

    public PriceBuilder withPriceCode(int priceCode) {
        this.priceCode = priceCode;
        return this;
    }
}
