package com.javase._03.declareclass;

public class NotesForModifiers {
    //
}

// modifier -> belirteç

// access modifier (public, private, protected)
// public;
// bir class eğer public yazılmışsa bu class'a paketin içindeki ve dışındaki tüm class'lar erişebilir.

// default;
// herhangi bir erişim belirteci kullanmamak anlamına gelir. eğer bir class hiçbir erişim belirteci kullanmadan
// yazılmışsa bu class'a sadece aynı paketin içindeki class'lar erişebilir. paketin dışındaki class'lar bu class'a erişemez.

// non-access modifier (final, abstract, static...)

// access modifier
// class ve interface'ler için access modifier olarak sadece public kullanılabilir.
// private ve protected kullanılamaz.

// Illegal modifier for the class Test; only public, abstract & final are permitted.
// protected class Test {}

// eğer public keyword yoksa default'tur. (access level2)

// public ise herkes erişebilir, default/friendly/package level -> sadece aynı paket!

// non-access modifier
// final
// bu keyword class, method, variable için kullanılabilir!
// bir class eğer final ise extends edilemez!
// final sadece bir kere değer alır, aldığı değer bir daha değişmez.

// public final class Integer
// public final class String

// abstract
// final ile abstract zıttır. bunlar bir araya GELEMEZ!
// abstract class extends edilmek için vardır.
// bir sınıf hem final hem abstract olamaz!
// obje oluşturamıyoruz. referansları alt sınıflara referans olabiliyor.
