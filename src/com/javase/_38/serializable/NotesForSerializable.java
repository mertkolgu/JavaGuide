package com.javase._38.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class NotesForSerializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Laptop laptop = new Laptop();
        laptop.price = 10000;
        laptop.brand = "apple";

        FileOutputStream fos = new FileOutputStream("laptop.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(laptop);
        oos.close();

        FileInputStream fis = new FileInputStream("laptop.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Laptop laptopFound = (Laptop) ois.readObject();
        System.out.println(laptopFound.price);
        System.out.println(laptopFound.brand);
    }

}

// java.io.Serializable

class Laptop implements Serializable {

    int price;
    transient String brand;
    // geçici, çabuk
}