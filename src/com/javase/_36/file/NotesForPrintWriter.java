package com.javase._36.file;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class NotesForPrintWriter {

    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter pw = new PrintWriter("folders/printWriter.txt");
        pw.println("line1");
        pw.println("line2");
        pw.println("line3");

        pw.close();

        // PrintWriter sınıfı var!
        // PrintReader diye bir sınıf yoktur.
    }
}