package com.javase._69.trywithresource;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourceTest01 {

    public static void main(String[] args) {

        FileWriter fw = null;

        try {
            fw = new FileWriter("file.txt");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                //
            }
        }

        // try with resource
        // close metodunu çağırmak genelde unutulabilir.
        // try-with resource yaklaşımı kullanıldığında arka planda otomatik olarak close işlemi yapılır.
        try (FileWriter fw2 = new FileWriter("file2.txt")) {
            fw2.write("test");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}