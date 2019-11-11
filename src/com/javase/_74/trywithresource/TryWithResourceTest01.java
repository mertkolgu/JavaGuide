package com.javase._74.trywithresource;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourceTest01 {

    public static void main(String[] args) {
        FileWriter fw = null;

        try {
            fw = new FileWriter("folders/file5.txt");
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
        try (FileWriter fw2 = new FileWriter("folders/file6.txt")) {
            fw2.write("test");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
