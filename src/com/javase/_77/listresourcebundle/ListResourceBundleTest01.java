package com.javase._77.listresourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ListResourceBundleTest01 {

    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("com.javase._77.listresourcebundle.Message", new Locale("en"));
        System.out.println(rb.getString("key1"));   // Hello Welcome!!!
        System.out.println(rb.getString("key2"));   // Good Bye!!!!

        ResourceBundle rb2 = ResourceBundle.getBundle("com.javase._77.listresourcebundle.Message", new Locale("tr"));
        System.out.println(rb2.getString("key1"));  // Merhaba, hoş geldiniz!
        System.out.println(rb2.getString("key2"));  // Hoşçakalın!
    }
}
