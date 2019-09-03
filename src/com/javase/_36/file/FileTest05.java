package com.javase._36.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileTest05 {

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(new FileReader("folders/ogrenciler.txt"))) {
            while (sc.hasNextLine()) {
                // System.out.println("Okunan satır : " + sc.nextLine());
                String ogrenciBilgisi = sc.nextLine();
                String[] array = ogrenciBilgisi.split(",");

                if (array[1].equalsIgnoreCase("bilgisayar mühendisliği")) {
                    System.out.println("Öğrenci Bilgisi : " + ogrenciBilgisi);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya açılırken bir hata oluştu.");
        }
    }
}