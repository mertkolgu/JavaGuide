package com.javase._39.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamTest02 {

    public static void main(String[] args) {
        File file = new File("folders/file.txt");
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(file, true);
            // true, dosyanın içeriğini silmeden dosyaya ekleme yapar
            fos.write(65);
            fos.write(74);

            byte[] array = {101, 75, 66, 68};
            fos.write(array);

            String s = "mert kolgu";
            byte[] sArray = s.getBytes();
            fos.write(sArray);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception Oluştu.");
        } catch (IOException e) {
            System.out.println("Dosyaya yazılırken bir hata oluştu.");
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("Dosya kapatılırken hata oluştu.");
            }
        }
    }
}
