package com.javase._75.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest03 {

    public static void main(String[] args) throws IOException {

        Path path1 = Paths.get("folders/folder");
        Path path2 = path1.toAbsolutePath();

        System.out.println(path1);
        System.out.println(path2);
        System.out.println(Files.isSameFile(path1, path2));

        Path path3 = Paths.get("folders/test.txt");
        Path path4 = Paths.get("folders/test2.txt");
        System.out.println(Files.isSameFile(path3, path4));
        // contente bakmaz!
    }
}