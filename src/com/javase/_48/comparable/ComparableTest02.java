package com.javase._48.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableTest02 {

    public static void main(String[] args) {
        Car car = new Car("BMW", "3Series", 2018, 5000L);
        Car car2 = new Car("Mercedes", "AMG", 2015, 15000L);
        Car car3 = new Car("Audi", "A3", 2019, 10000L);
        Car car4 = new Car("Ford", "Focus", 2016, 3000L);
        Car car5 = new Car("Toyota", "Auris", 2012, 1000L);

        List<Car> list = Arrays.asList(car, car2, car3, car4, car5);

        Collections.sort(list);

        for (Car c : list)
            System.out.println(c);
        // Car{brand='Toyota', model='Auris', year=2012, price=1000}
        // Car{brand='Mercedes', model='AMG', year=2015, price=15000}
        // Car{brand='Ford', model='Focus', year=2016, price=3000}
        // Car{brand='BMW', model='3Series', year=2018, price=5000}
        // Car{brand='Audi', model='A3', year=2019, price=10000}
        //-----------------------------------------------------------
        // Car{brand='Audi', model='A3', year=2019, price=10000}
        // Car{brand='BMW', model='3Series', year=2018, price=5000}
        // Car{brand='Ford', model='Focus', year=2016, price=3000}
        // Car{brand='Mercedes', model='AMG', year=2015, price=15000}
        // Car{brand='Toyota', model='Auris', year=2012, price=1000}
    }
}
