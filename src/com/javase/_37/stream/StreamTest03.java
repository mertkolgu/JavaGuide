package com.javase._37.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamTest03 {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("folders/test1.txt");

//            System.out.println("Birinci karakter : " + (char) (fis.read()));
//            System.out.println("İkinci karakter : " + (char) (fis.read()));
//            System.out.println("Üçüncü karakter : " + (char) (fis.read()));

//            fis.skip(5);    // index 5'ten sonra okumaya başla
//            System.out.println("Okunan karakter : " + (char) (fis.read())); // P

            // bir dosyayı baştan sona kadar okuma
//            int deger;
//            String s = "";

            // dosyanın sonuna gelene kadar while devam eder
//            while ((deger = fis.read()) != -1) {
//                s += (char) deger;
//            }
//
//            System.out.println("Dosya içeriği : " + s);

            // dosyanın belli bir yerinden başlayıp belli sayıda karakter okuma
            int say = 0;
            int deger;
            String s = "";
            fis.skip(5);

            while ((deger = fis.read()) != -1) {
                s += (char) deger;

                say++;

                if (say == 11) {
                    break;
                }
            }
            System.out.println("Dosyanın 5. Yerinden İtibaren 10 Karakter : " + s);
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya okunurken hata oluştu.");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("Dosya kapatılırken bir hata oluştu.");
            }
        }
    }
}