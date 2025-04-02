package fr.r6a06;

public class Movie {
    public static final int  CHILDRENS = 2;
    public static final int  REGULAR = 0;
    public static final int  NEW_RELEASE = 1;

    private String _title;
    private Price _price;

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }
    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public void setPriceCode(int priceCode) {
       _price = new PriceBuilder().withPriceCode(priceCode).build();
    }
    public String getTitle (){
        return _title;
    };

    public double getCharge(int daysRented){
        return this._price.getCharge(daysRented);
    }


    public int getFrequentRenterPoints(int daysRented) {

        if ((this._price.getPriceCode() == NEW_RELEASE) &&
                daysRented > 1)
            return 2;
        else
            return 1;
    }
}