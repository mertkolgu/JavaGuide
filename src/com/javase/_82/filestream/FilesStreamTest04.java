package com.javase._77.filestream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesStreamTest04 {

    public static void main(String[] args) {

        try (Stream<String> stream = Files.lines(Paths.get("folders/lines.txt"))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}