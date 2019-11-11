package com.javase._79.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {

    public static void main(String[] args) {
        Path path3 = Paths.get("folders/folder", "folder2", "zoodirector");
        System.out.println(path3);  // folders\folder\folder2\zoodirector
        System.out.println(path3.isAbsolute()); // false
        System.out.println(path3.toAbsolutePath()); // D:\Projeler\java-guide\folders\folder\folder2\zoodirector
    }
}

// public static Path get(String first, String... more) {
