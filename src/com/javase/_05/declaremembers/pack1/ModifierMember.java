package com.javase._05.declaremembers.pack1;

public class ModifierMember {
    private int privateNumber = 100;
    int defaultNumber = 100;
    protected int protectedNumber = 100;
    public int publicNumber = 100;

    void method() {
        // private değişkene sadece ilgili sınıf erişebilir.
        System.out.println(privateNumber);
    }
}
