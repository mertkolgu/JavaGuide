package com.javase._74.trywithresource;

import java.util.Scanner;

public class TryWithResourceTest02 {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            s.nextLine();
            s.close();
        }
        // close metodunu çağırmaya gerek yok!
        // try-with resource yaklaşımını kullandık.
        // close metodunu açık şekilde çağırmaya gerek yoktur!

        try (Scanner s2 = new Scanner(System.in)) {
            s2.nextLine();
        } catch (Exception e) {
            // s2.nextInt(); // DOES NOT COMPILE
        } finally {
            // s2.nextInt(); // DOES NOT COMPILE
        }
        // try-with resource yaklaşımında değişkenin (s2) lifecycle'i try bloğu ile sınırlıdır.
        // The problem is that Scanner has gone out of scope at the end of the try clause
    }
}
