package com.javase._74.trywithresource;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResourceTest05 {

    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("folders/diller.txt")) {
            Scanner sc = new Scanner(System.in);
            String dil;

            while (true) {
                System.out.print("Bir dil giriniz : ");
                dil = sc.nextLine();

                if (dil.equals("-1")) {
                    System.out.println("Programdan çıkılıyor.");
                    System.out.println("Dosyayı kontrol edin.");
                    break;
                }
                fileWriter.write(dil + "\n");
            }
        } catch (IOException e) {
            System.out.println("Dosya oluşturulurken hata oluştu.");
        }
    }
}
