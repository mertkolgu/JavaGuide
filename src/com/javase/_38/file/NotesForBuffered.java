package com.javase._38.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NotesForBuffered {

    public static void main(String[] args) throws IOException {
        File file = new File("folders/buffered.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("line1");
        bw.write("\n");
        bw.write("line2");

        bw.close();

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        // readLine metodu sağlar.

        String lineContent = null;
        int line = 1;
        while ((lineContent = br.readLine()) != null) {
            System.out.println(line + " , " + lineContent);
            line++;
        }
    }
}

// FileReader dosyadaki bilgiyi karakter karakter okur.
// BufferedReader dosyadaki bilgiyi dosyanın en sonuna kadar okur.
