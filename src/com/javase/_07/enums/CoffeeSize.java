package com.javase._07.enums;

public enum CoffeeSize {

    SHORT(3), TALL(5), GRANDE(7), VENTI(10);

    private int price;

    CoffeeSize(int price) {

        // constructor olduğu zaman hata ortadan kalkar.
        this.price = price;
    }


    public int getPrice() {
        return price;
    }
}