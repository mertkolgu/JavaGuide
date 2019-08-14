package com.javase._05.declaremembers.pack1;

public class MemberTest {

    public static void main(String[] args) {

        ModifierMember mb = new ModifierMember();
        System.out.println(mb.defaultNumber);
        System.out.println(mb.publicNumber);
        System.out.println(mb.protectedNumber);
        // System.out.println(mb.privateNubmer);
        // private bir değişkene ya da methoda sadece AYNI sınıf içerisinden erişim sağlanabilir!
        // farklı bir sınıftan erişim sağlanamaz!
        // KALITIM bile olsa private değişkene erişim sağlanamaz!
    }
}