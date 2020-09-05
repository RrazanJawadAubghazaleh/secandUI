package com.example.sacand.data;

public class Meal {
    private String mealName;
    private String mealPriceOne;
    private String mealPriceTew;
    private String mealPriceThree;
    private boolean isFreeDelivery;
    private int melImage;

    public boolean isFreeDelivery() {
        return isFreeDelivery;
    }

    public void setFreeDelivery(boolean freeDelivery) {
        isFreeDelivery = freeDelivery;
    }

    public String getMealPriceOne() {
        return mealPriceOne;
    }

    public void setMealPriceOne(String mealPriceOne) {
        this.mealPriceOne = mealPriceOne;
    }

    public String getMealPriceTew() {
        return mealPriceTew;
    }

    public void setMealPriceTew(String mealPriceTew) {
        this.mealPriceTew = mealPriceTew;
    }

    public String getMealPriceThree() {
        return mealPriceThree;
    }

    public void setMealPriceThree(String mealPriceThree) {
        this.mealPriceThree = mealPriceThree;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }


    public int getMelImage() {
        return melImage;
    }

    public void setMelImage(int melImage) {
        this.melImage = melImage;
    }
}
