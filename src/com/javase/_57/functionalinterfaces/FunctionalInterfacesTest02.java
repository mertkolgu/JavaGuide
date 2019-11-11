package com.javase._57.functionalinterfaces;

public class FunctionalInterfacesTest02 {
    // For a functional interface, declaring methods from Object class in an
    // interface does not count as an abstract method.
}

@FunctionalInterface
interface F1 {
    void test();
}

// @FunctionalInterface
interface F2 {
    public boolean equals(Object obj);
    // bu metot aynı gramerde Object sınıfında yer alır!!!
    // bu metot sayılmaz!!!
    // böyle bir deklerasyonda bu metottaki abstract metot sayısı
    // functional interface kavramı açısından 0(sıfır)
}

@FunctionalInterface
interface F3 {
    public int test();
    public boolean equals(Object obj);  // DİKKAT, bu java.lang.Object sınıfında yer alan metot!
}
// A functional interface consists of exactly one abstract method
// but can contain any number of default or static methods.
// functional interface'ler tam olarak 1 tane abstract metot olmalıdır! (ne bir eksik ne bir fazla!)
// java.lang.Object sınıfındaki metot istisnasına dikkat edelim!
