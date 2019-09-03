package com.javase._38.serializable;

import java.io.*;

public class SerializableTest01 {

    public static void main(String[] args) {

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("folders/ogrenci.bin"))) {
            // folders/ogrenci.dat, folders/ogrenci.ser de yazılabilir.
            Ogrenci ogrenci = new Ogrenci("Mert Kolğu", "Bilgisayar Mühendisliği", 1421012072);
            Ogrenci ogrenci1 = new Ogrenci("Oğuz", "Bilgisayar Mühendisliği", 1521012042);

            outputStream.writeObject(ogrenci);
            outputStream.writeObject(ogrenci1);

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu.");
        }
    }
}

class Ogrenci implements Serializable {
    private String isim;
    private String bolum;
    private int id;
    private static final long serialVersionUID = 1000;
    // class'a version atadık ki daha sonradan güncelleme yaparken sıkıntı çıkmasın

    public Ogrenci(String isim, String bolum, int id) {
        this.isim = isim;
        this.bolum = bolum;
        this.id = id;
    }

    @Override
    public String toString() {
        String bilgiler = "Öğrenci İsmi : " + isim + "\n"
                + "Öğrenci Bölüm : " + bolum + "\n"
                + "Öğrenci Numarası : " + id;
        return bilgiler;
    }
}

class ObjeyiOku {

    public static void main(String[] args) {

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("folders/ogrenci.bin"))) {

            Ogrenci ogrenci = (Ogrenci) inputStream.readObject();
            Ogrenci ogrenci1 = (Ogrenci) inputStream.readObject();

            System.out.println("***************************************");
            System.out.println(ogrenci);
            System.out.println("***************************************");
            System.out.println(ogrenci1);
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu.");
        } catch (ClassNotFoundException e) {
            System.out.println("Sınıf bulunamadı.");
        }
    }
}