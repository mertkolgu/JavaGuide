package com.javase._36.file;

import java.io.File;

public class FileTest03 {

    public static void main(String[] args) {

        File file = new File(".");
        String[] names = file.list();

        for (String n : names)
            System.out.println(n);

        System.out.println();
        File[] files = file.listFiles();

        for (File f : files) {
            if (f.isDirectory()) {
                System.out.println("directory : " + f.getAbsolutePath());
            } else if (f.isHidden()) {
                System.out.println("hidden : " + f.getAbsolutePath());
            } else {
                System.out.println("normal file : " + f.getAbsolutePath());
            }
        }
    }
}