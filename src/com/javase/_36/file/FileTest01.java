package com.javase._36.file;

import java.io.File;
import java.io.IOException;

public class FileTest01 {

    public static void main(String[] args) throws IOException {

        File directory = new File("folder");
        directory.mkdir();

        File file = new File(directory, "file.txt");
        file.createNewFile();

        System.out.println(directory.isDirectory());
        System.out.println(directory.getAbsolutePath());

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        System.out.println(directory.delete()); // klasör/directory dolu iken silmez!
        System.out.println(file.delete());
        // System.out.println(directory.delete());
    }
}