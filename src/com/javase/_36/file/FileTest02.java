package com.javase._36.file;

import java.io.File;
import java.io.IOException;

public class FileTest02 {

    public static void main(String[] args) throws IOException {

        File file = new File("old_name.txt");
        file.createNewFile();

        File fileNewName = new File("new_name.txt");
        file.renameTo(fileNewName);
    }
}