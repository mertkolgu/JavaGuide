package com.javase._81.attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class AttributesTest02 {

    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("folders/original/file.txt");
        BasicFileAttributes attributes = Files.readAttributes(p1, BasicFileAttributes.class);

        System.out.println(attributes.creationTime());  // 2019-09-22T20:32:10.443988Z
        System.out.println(attributes.isDirectory());   // false
        System.out.println(attributes.isRegularFile()); // true
        System.out.println(attributes.lastAccessTime());  // 2019-11-09T22:27:21.851073Z
        System.out.println(attributes.size());  // 0
    }
}
