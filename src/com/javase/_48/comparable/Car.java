package com.javase._48.comparable;

public class Car implements Comparable<Car> {
    private String brand;
    private String model;
    private Integer year;
    private Long price;

    public Car(String brand, String model, Integer year, Long price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public int compareTo(Car o) {
        // wrapper sınıflarda compareTo metodu yer alır, bu şekilde sıralama yapılabilir.
        // return year.compareTo(o.getYear());  // küçükten büyüğe doğru sıralama yapar
        return o.getYear().compareTo(year); // büyükten küçüğe doğru sıralama yapar
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
