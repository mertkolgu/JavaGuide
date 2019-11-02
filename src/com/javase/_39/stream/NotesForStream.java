package com.javase._39.stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class NotesForStream {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("folders/fos.txt");
        String content = "content line1";
        fos.write(content.getBytes());
        fos.close();
    }
}

// Writer/Reader -> Character Oriented
// InputStream/OutputStream -> Byte Oriented
