package com.javase._75.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest01 {

    public static void main(String[] args) throws IOException {

        Path path1 = Paths.get("folders/test.txt");

        if (!Files.exists(path1)) {
            Files.createFile(path1);
            // java.nio.file.FileAlreadyExistsException:
        }

        Path path2 = Paths.get("com/javase/_75.files/myFile.txt");
        System.out.println(Files.exists(path2));

//        if (!Files.exists(path2)) {
//            Files.createFile(path2);
//        }
    }
}