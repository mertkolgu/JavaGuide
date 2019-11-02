package com.javase._13.polymorphism;

public class NotesForOverrideVSOverloaded {
    //
}

// overloaded metotlar için parametreleri değişmelidir.
// sayı, tip olabilir.
// override metotlar için ise parametre aynı olmalıdır.

// overloaded metotlar için dönüş tipi değişebilir!
// override metotlarda ise dönüş tipi değişmez.

// overloaded metotlar için access level değişebilir fark etmez.
// override metotlar için access level artabilir, azalamaz.

// public > protected > default > private level

// overloaded metotlar için değişkenin tipi önemlidir. (compile time da belli olur)
// override metotlar için ise objenin tipi önemlidir. çalışma zamanında/run time'da objenin tipine göre karar verilir.

class SuperClass {

    public void override(String param1, int param2) {
        //
    }

    void override2(String param1, int param2) {
        //
    }

    public static void staticMethodCantBeOverriden(String param1, int param2) {
        //
    }
}

class SubClass extends SuperClass {

    // bu metot override olmaz!
    // override metotlarda dönüş tipi değişmez.
//    public int override(String param1, int param2) {
//        return 0;
//    }

    // access level azalamaz!!!
//    void override(String param1, int param2) {
//        //
//    }

    // access level artabilir!!!
    protected void override2(String param1, int param2) {
        //
    }

    // override değil
    // bahsedilen override metot kuralları bu durum için de geçerlidir!!!
    // yani public olduğu için access level azalamaz!!!
//    static void staticMethodCantBeOverriden(String param1, int param2) {
//        //
//    }
}
