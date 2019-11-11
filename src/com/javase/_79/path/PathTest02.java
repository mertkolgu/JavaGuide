package com.javase._79.path;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {

    public static void main(String[] args) {
        Path path1 = Paths.get("/folders/folder/folder2/folder3/test.txt");
        System.out.println(path1.getFileName());    // test.txt
        System.out.println(path1.getRoot());    // \
        System.out.println(path1.getParent());  // \folders\folder\folder2\folder3
        System.out.println(path1.getNameCount());   // 5
        System.out.println(path1.getName(2));   // folder2 (0'dan başlar)
        // 0 -> folder
        // 1 -> folder2
        // 2 -> folder3
        // 3 -> test.txt
        System.out.println(path1.getClass());   // class sun.nio.fs.WindowsPath
        System.out.println(path1.isAbsolute()); // false
        System.out.println(path1.subpath(1, 3)); // folder\folder2 (0'dan başlar , [beginIndex, endIndex))
        System.out.println(path1.getFileSystem());  // sun.nio.fs.WindowsFileSystem@6acbcfc0

        File file1 = path1.toFile();
        Path pathToPath = file1.toPath();
    }
}

// path;
// absolute, relative olabilir.
// unix sistemler için -> /
// windows -> c:\\ d:\\
