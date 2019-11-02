package com.javase._38.file;

import java.io.File;
import java.io.IOException;

public class FileTest01 {

    public static void main(String[] args) throws IOException {
        File directory = new File("folders/folder");
        directory.mkdir();

        File file = new File(directory, "file.txt");
        file.createNewFile();

        System.out.println(directory.isDirectory());    // true
        System.out.println(directory.getAbsolutePath());    // dosyanın yolu

        System.out.println(file.isFile());  // true
        System.out.println(file.isDirectory()); // false

        System.out.println(directory.delete()); // klasör/directory dolu iken silmez!
        System.out.println(file.delete());
        // System.out.println(directory.delete());
    }
}
