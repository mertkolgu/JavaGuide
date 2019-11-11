package com.javase._78.pathnio;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathNioTest01 {

    public static void main(String[] args) {
        File file = new File("folders/test.txt");
        // hatırlayacağımız gibi burada File objesi oluşur,
        // bu kod storage'da yeni bir test.txt dosyası OLUŞTURMAZ!

        // bu durum Path için de geçerli!
        Path path = Paths.get("folders/test.txt");

        // class sun.nio.fs.WindowsPath
        System.out.println(path.getClass());
    }
}

// java.nio.file.Path -> interface, eski java.io.File'a karşılık gelmekte.
// java 1.7 ile birlikte gelen bir özellik/interface
// nio için entry point interface

// java.nio.file.Path
