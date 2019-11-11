package com.javase._82.filestream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesStreamTest02 {

    public static void main(String[] args) throws IOException {
        Stream<Path> stream = Files.walk(Paths.get("."));
        stream.forEach(System.out::println);
        stream.close();

        // public static Stream<Path> walk(Path start,int maxDepth, FileVisitOption... options)
        Stream<Path> stream2 = Files.walk(Paths.get("."), 2);
        stream2.forEach(System.out::println);
    }
}
