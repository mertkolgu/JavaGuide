package com.javase._76.attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AttributesTest01 {

    public static void main(String[] args) throws IOException {

        Path p1 = Paths.get("dir1");
        System.out.println(Files.isDirectory(p1));
        System.out.println(Files.isRegularFile(p1));
        System.out.println(Files.isExecutable(p1));
        System.out.println(Files.isReadable(p1));
        System.out.println(Files.isWritable(p1));
        System.out.println(Files.isHidden(p1)); // throws IOException

        Path p2 = Paths.get("test.txt");
        System.out.println(Files.size(p2));
        System.out.println(Files.getLastModifiedTime(p2));
        System.out.println(Files.getOwner(p2));
    }
}