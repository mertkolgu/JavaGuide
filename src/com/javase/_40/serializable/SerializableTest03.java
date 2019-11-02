package com.javase._40.serializable;

import java.io.*;

public class SerializableTest03 {

    public static void main(String[] args) {
        OgrenciV3 ogrenci = new OgrenciV3("Mert Kolğu", "Bilgisayar Mühendisliği", 1421012072);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("folders/ogrenciV3.bin"))) {
            OgrenciV3.setOgrenciSayisi(100);
            outputStream.writeObject(ogrenci);
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu.");
        }
    }
}

class OgrenciV3 implements Serializable {
    private String isim;
    private String bolum;
    private transient int id;
    private static final long serialVersionUID = 1000;
    private static int ogrenciSayisi = 0;
    // bunu serileştirmiyoruz

    public OgrenciV3(String isim, String bolum, int id) {
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

    public static int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public static void setOgrenciSayisi(int ogrenciSayisi) {
        OgrenciV3.ogrenciSayisi = ogrenciSayisi;
    }
}

class ObjeyiOkuV3 {

    public static void main(String[] args) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("folders/ogrenciV3.bin"))) {
            OgrenciV3 ogrenci = (OgrenciV3) inputStream.readObject();
            System.out.println(ogrenci);
            System.out.println("Öğrenci Sayısı : " + OgrenciV3.getOgrenciSayisi());
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu.");
        } catch (ClassNotFoundException e) {
            System.out.println("Sınıf bulunamadı.");
        }
    }
}
