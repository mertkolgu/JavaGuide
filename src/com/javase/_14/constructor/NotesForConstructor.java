package com.javase._14.constructor;

public class NotesForConstructor {
    //
}

// Java'da bütün sınıflarda constructor olmak zorundadır!
// bu kurala abstract classlar da dahildir! yani abstract classlar için de constructor olmalıdır!
// interfaceler için bu durum söz konusu değildir!

// eğer bir sınıf/class için biz constructor tanımlamazsak, java bizim için bir tane constructor tanımlar!
// arka planda default constructor tanımlanır.
// bu constructor da no-arg/parametre almayan constructor'dır.

class Person {

    // java bizim için bu şekilde bir constructor tanımlar!
    Person() {
        //
    }
}

// eğer biz bir constructor tanımlarsak, java otomatik olarak başka bir constructor TANIMLAMAZ!

class Employee {

    private String name;

    Employee(String name) {
        this.name = name;
    }

    // eğer yukarıdaki gibi bir constructor tanımlarsak, artık java bizim için no-arg/parametre almayan bir constructor TANIMLAMAZ!
    // yani bizim işimize karışmaz.
    // Employee() {
        // ARKA PLANDA TANIMLANMAZ!!!
    // }

    // dolayısıyla ister biz tanımlayalım, ister java tanımlasın her class için en az 1 tane constructor TANIMLANIR!
}

// constructorlar tüm access modifierları alabilirler.
// private, protected, public ya da package level olabilir.

// constructor ismi ile sınıf/class ismi aynı olmalıdır.

// constructorların dönüş tipi void dahi olamaz!

class AccessLevel {

    public AccessLevel() {
        //
    }

    private AccessLevel(int number) {
        //
    }
}

class Sample {

//    Sample2() {
//        //
//    }
    // constructor değildir! METOTTUR!

    // This method has a constructor name
    void Sample() {
        //
    }
}

// constructoların ilk ifadesi super ya da this olabilir.
// bu iki ifade bir arada olamaz yani bir constructorda hem this, hem super ifadesi yer alamaz.

// this(...) ifadesi ilgili sınıftaki diğer constructorı çağırır.
// super() ifadesi ise bir üst sınıftaki ilgili constructor'ı çağırır.