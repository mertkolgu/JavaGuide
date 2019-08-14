package com.javase._74.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest04 {

    public static void main(String[] args) {

        Path path1 = Paths.get("../../test/sub/a/b.txt");
        System.out.println(path1.toAbsolutePath());
        System.out.println(path1.toAbsolutePath().normalize());
    }
}

// D:\Projeler\JavaGuide\..\..\test\sub\a\b.txt
// D:\test\sub\a\b.txt