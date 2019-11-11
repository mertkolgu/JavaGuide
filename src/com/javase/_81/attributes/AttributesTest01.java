package com.javase._81.attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AttributesTest01 {

    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("folders/dir1");
        System.out.println(Files.isDirectory(p1));  // true
        System.out.println(Files.isRegularFile(p1));    // false
        System.out.println(Files.isExecutable(p1)); // true
        System.out.println(Files.isReadable(p1));   // true
        System.out.println(Files.isWritable(p1));   // true
        System.out.println(Files.isHidden(p1)); // false -> throws IOException

        Path p2 = Paths.get("folders/test.txt");
        System.out.println(Files.size(p2)); // 0
        System.out.println(Files.getLastModifiedTime(p2));  // 2019-09-22T20:32:10.443988Z
        System.out.println(Files.getOwner(p2)); // MERT-PC\Mert (User)
    }
}
