package com.javase._36.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest07 {

    public static void main(String[] args) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("folders/ogrenciler.txt", true))) {
            bufferedWriter.write("Mert Kolğu,Bilgisayar Mühendisliği\n");
        } catch (IOException e) {
            System.out.println("Dosya açılırken hata oluştu.");
        }
    }
}