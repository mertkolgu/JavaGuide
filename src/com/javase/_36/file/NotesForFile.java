package com.javase._36.file;

import java.io.File;
import java.io.IOException;

public class NotesForFile {

    public static void main(String[] args) {

        File file = new File("folders/test.txt");
        // File objesi oluşur!
        // harddiskte yeni bir dosya oluşmaz.

        try {
            System.out.println(file.exists());
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// java.io.File
// File -> dosya
// File sınıfı bir dosyayı(file) ya da bir dizin/directory/folder'ı gösterebilir.
// Bu sınıf dosyadan veri okumak/yazmak için KULLANILMAZ.
// File sınıfını, yeni bir boş dosya oluşturmak, klasör oluşturmak,
// dosya silmek, isim değiştirmek gibi işlemler için kullanabiliriz.