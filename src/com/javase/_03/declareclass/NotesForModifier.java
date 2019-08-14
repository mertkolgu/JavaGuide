package com.javase._03.declareclass;

public class NotesForModifier {
    //
}

// modifier -> belirteç

// access modifier (public, private, protected)
// non-access modifier (final, abstract, static...)

// access modifier
// class ve interface'ler için access modifier olarak sadece public kullanılabilir.

// Illegal modifier for the class Test; only public, abstract & final are permitted.
// protected class Test {}

// eğer public keyword yoksa default'tur. (access level2)

// public ise herkes erişebilir, default/friendly/package level -> sadece aynı paket!

// non-access modifier
// final
// bu keyword class, method, variable için kullanılabilir!
// bir class eğer final ise extends edilemez!

// public final class Integer
// public final class String

// abstract
// final ile abstract zıttır. bunlar bir araya GELEMEZ!
// abstract class extends edilmek için vardır.
// bir sınıf hem final hem abstract olamaz!