package com.javase._64.binary;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionTest01 {

    // public interface BiFunction<T, U, R> {
    // R apply(T t, U u);
    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction1 = (String x, String y) -> {
            return x.concat(y);
        };

        BiFunction<String, String, String> biFunction2 = (x, y) -> x + y;

        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);

        // public String concat(String str) {
        BiFunction<String, String, String> biFunction3 = String::concat;

        // BiFunction<String, String, String> biFunction4 = String::toUpperCase; //compile error

        Function<String, String> function = String::toUpperCase;
        Function<String, String> function2 = x -> x.toUpperCase();
        // public String toUpperCase() {

        // public static int compare(double d1, double d2) {
        BiFunction<Double, Double, Integer> compareDoubles = Double::compare;

        // public int compareTo(Double anotherDouble) {
        BiFunction<Double, Double, Integer> compareDoublesV2 = Double::compareTo;
        // public int compareTo(Double anotherDouble) {

        System.out.println(compareDoubles.apply(10.0, 10.0));
    }
}
