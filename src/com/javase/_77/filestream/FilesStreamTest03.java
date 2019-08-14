package com.javase._77.filestream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class FilesStreamTest03 {

    public static void main(String[] args) throws IOException {

        BiPredicate<Path, BasicFileAttributes> matcher = (path, attribute) -> attribute.isRegularFile()
                && path.toString().endsWith("java");

        try (Stream<Path> stream = Files.find(Paths.get("."), 4, matcher)) {
            stream.forEach(System.out::println);
        }
    }
}