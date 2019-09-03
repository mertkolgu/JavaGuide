package com.javase._36.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileTest04 {

    public static void main(String[] args) {

        FileWriter writer = null;

        try {
            writer = new FileWriter("folders/file2.txt", true);
            // true ile dosyanın sonundan yazmaya devam eder

            writer.write("Java Programming Language\n");
            writer.write("Mert Kolğu\n");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu.");
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Dosya kapatılırken bir hata oluştu.");
                }
            }
        }
    }
}