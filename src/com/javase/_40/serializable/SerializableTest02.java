package com.javase._40.serializable;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SerializableTest02 {

    public static void main(String[] args) {
        OgrenciV2 ogrenci = new OgrenciV2("Mert Kolğu", "Bilgisayar Mühendisliği", 1421012072);
        OgrenciV2 ogrenci1 = new OgrenciV2("Oğuz", "Bilgisayar Mühendisliği", 1521012042);
        OgrenciV2 ogrenci2 = new OgrenciV2("Mehmet", "Makine Mühendisliği", 1721422052);

        OgrenciV2[] ogrenciArray = {ogrenci, ogrenci1, ogrenci2};
        ArrayList<OgrenciV2> ogrenciList = new ArrayList<>(Arrays.asList(ogrenciArray));
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("folders/ogrenciV2.bin"))) {
            outputStream.writeObject(ogrenciArray);
            outputStream.writeObject(ogrenciList);
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu.");
        }
    }
}

class OgrenciV2 implements Serializable {
    private String isim;
    private String bolum;
    private int id;
    private static final long serialVersionUID = 1000;

    public OgrenciV2(String isim, String bolum, int id) {
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

class ObjeyiOkuV2 {

    public static void main(String[] args) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("folders/ogrenciV2.bin"))) {
            OgrenciV2[] ogrenciArray = (OgrenciV2[]) inputStream.readObject();
            ArrayList<OgrenciV2> ogrenciList = (ArrayList<OgrenciV2>) inputStream.readObject();

            System.out.println("***************************************");
            for (OgrenciV2 o : ogrenciArray) {
                System.out.println(o);
                System.out.println("***************************************");
            }

            System.out.println("***************************************");
            for (OgrenciV2 o : ogrenciList) {
                System.out.println(o);
                System.out.println("***************************************");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu.");
        } catch (ClassNotFoundException e) {
            System.out.println("Sınıf bulunamadı.");
        }
    }
}
