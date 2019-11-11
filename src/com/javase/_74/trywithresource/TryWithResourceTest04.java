package com.javase._74.trywithresource;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourceTest04 {

    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("folders/file3.txt");
             FileWriter fileWriter1 = new FileWriter("folders/file4.txt")) {
            fileWriter.write("Deneme");
            fileWriter1.write("Deneme");
        } catch (IOException e) {
            System.out.println("Dosya oluşturulurken hata oluştu.");
        }
    }
}
