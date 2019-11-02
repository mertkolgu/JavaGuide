package com.javase._38.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NotesForFileWriterAndReader {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("folders/file1.txt");
        fw.write("line1");
        fw.write("\n");
        fw.write("line2");
        fw.write("\n");
        fw.write("line3");

        fw.close(); // CLOSE etmeyi UNUTMA!!!!

        FileReader fr = new FileReader("folders/file1.txt");

        char[] input = new char[100];
        fr.read(input);

        for (char c : input)
            System.out.print(c);

        // excel için vs https://poi.apache.org/

        // https://community.jaspersoft.com/project/ireport-designer
        // jasper report

        // https://www.crystalreports.com/
    }
}

// Reader/Writer
// Stream
