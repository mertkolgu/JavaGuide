package com.javase._76.attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class AttributesTest02 {

    public static void main(String[] args) throws IOException {

        Path p1 = Paths.get("original/file.txt");

        BasicFileAttributes attributes = Files.readAttributes(p1, BasicFileAttributes.class);

        System.out.println(attributes.creationTime());
        System.out.println(attributes.isDirectory());
        System.out.println(attributes.isRegularFile());
        System.out.println(attributes.lastAccessTime());
        System.out.println(attributes.size());
    }
}