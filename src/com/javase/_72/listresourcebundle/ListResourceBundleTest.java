package com.javase._72.listresourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ListResourceBundleTest {

    public static void main(String[] args) {

        ResourceBundle rb = ResourceBundle.getBundle("com.myjavase._72.listresourcebundle.Message", new Locale("en"));
        System.out.println(rb.getString("key1"));
        System.out.println(rb.getString("key2"));

        ResourceBundle rb2 = ResourceBundle.getBundle("com.myjavase._72.listresourcebundle.Message", new Locale("tr"));
        System.out.println(rb2.getString("key1"));
        System.out.println(rb2.getString("key2"));
    }
}