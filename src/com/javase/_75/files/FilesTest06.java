package com.javase._75.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesTest06 {

    public static void main(String[] args) throws IOException {

        Path p1 = Paths.get("buffered.txt");

        try (BufferedWriter bw = Files.newBufferedWriter(p1)) {
            bw.write("line1\nline2\nline3");
        }

        try (BufferedReader br = Files.newBufferedReader(p1)) {

            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }

        // dosya içeriğini satır satır listeye atmakta!
        // büyük dosyalar için probleme neden olabilir. OutOfMemory!
        List<String> lines = Files.readAllLines(p1);
        System.out.println(lines);
    }
}
