package com.javase._74.path;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {

    public static void main(String[] args) {

        Path path1 = Paths.get("/folder/folder2/folder3/test.txt");
        System.out.println(path1.getFileName());
        System.out.println(path1.getRoot());
        System.out.println(path1.getParent());
        System.out.println(path1.getNameCount());
        System.out.println(path1.getName(2));   // 0 dan başlar
        // 0 -> folder
        // 1 -> folder2
        // 2 -> folder3
        // 3 -> test.txt
        System.out.println(path1.getClass());
        System.out.println(path1.isAbsolute());
        System.out.println(path1.subpath(1, 3)); // 0 dan başlar , [beginIndex, endIndex )
        System.out.println(path1.getFileSystem());
        // sun.nio.fs.WindowsFileSystem@6acbcfc0

        File file1 = path1.toFile();
        Path pathToPath = file1.toPath();
    }
}

// path;
// absolute, relative olabilir.
// unix sistemler için -> /
// windows -> c:\\ d:\\