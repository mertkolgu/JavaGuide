package com.javase._49.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest01 {

    public static void main(String[] args) {
        Car car = new Car("BMW", "3Series", 2018, 5000L);
        Car car2 = new Car("Mercedes", "AMG", 2015, 15000L);
        Car car3 = new Car("Audi", "A3", 2019, 10000L);
        Car car4 = new Car("Ford", "Focus", 2016, 3000L);
        Car car5 = new Car("Toyota", "Auris", 2012, 1000L);

        List<Car> list = Arrays.asList(car, car2, car3, car4, car5);

        Collections.sort(list, new CarSortByYear());

        for (Car c : list)
            System.out.println(c);
        // Arrays.sort'da arrayleri sıralamak için kullanılır.
    }
}

class CarSortByYear implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        // return o1.getYear().compareTo(o2.getYear());
        return Integer.compare(o1.getYear(), o2.getYear());
    }
}

class CarSortByPrice implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }
}