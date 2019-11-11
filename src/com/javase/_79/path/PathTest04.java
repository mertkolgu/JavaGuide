package com.javase._79.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest04 {

    public static void main(String[] args) {
        Path path1 = Paths.get("../../test/sub/a/b.txt");
        System.out.println(path1.toAbsolutePath()); // D:\Projeler\JavaGuide\..\..\test\sub\a\b.txt
        System.out.println(path1.toAbsolutePath().normalize()); // D:\test\sub\a\b.txt
    }
}
