package com.javase._71.optional;

import java.util.Optional;

public class OptionalTest05 {

    public static void main(String[] args) {
        Optional<String> string = Optional.ofNullable(null);    // Optional.empty

        System.out.println(string.map(String::length).orElse(-1));  // -1
        // This code prints -1 because the variable string is an Optional variable that
        // holds null and hence the orElse() method executes and returns -
        // public T orElse(T other) {

//		Integer number ;
//		if(number == null) {
//			return -1;
//		}
    }
}

class Person {
    int age;
}
