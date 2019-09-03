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

        FileOutputStream fos = new FileOutputStream("folders/laptop.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(laptop);
        oos.close();

        FileInputStream fis = new FileInputStream("folders/laptop.ser");
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

// Java, Serialization API sayesinde Serializable interface'ini implemente eden class'ların objelerini
// bir byte dizisine dönüştürüp bir dosyaya kaydetme imkanı verir.
// Java'da bu işleme objelerin serileştirilmesi yani Serialization adı verilir.
// Sonradan ise bu objeleri dosyadan okumak için yaptığımız işleme ise DeSerialization adı verilir.

// Serialization Avantajları

// Objelerin state'lerini (anlık durumlarını) ve özelliklerini daha sonra kullanmak için saklamak istiyorsak
// Serialization kullanabiliriz. Örneğin; oyunlarda kaydettiğimiz yerden devam etmek istiyorsak Serialization
// mantığı kullanılıyor diyebiliriz.

// 2 platform arasındaki veri alışverişini objeler üzerinden yapmak istiyorsak objelerimizi serileştirip
// dosya transferi yapabiliriz. Örneğin; bir chat uygulamasında mesajları obje olarak düşünürsek
// bunları serileştirme yolu ile transfer edebiliriz.

// Bir objenin oluşması çok uzun sürüyorsa ve daha sonradan bu objeyi kullanmak istiyorsak bir daha
// bu objeyi oluşturmak yerine bu objeyi serileştirerek daha sonra kullanabiliriz.