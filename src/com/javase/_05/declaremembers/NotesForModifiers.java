package com.javase._05.declaremembers;

public class NotesForModifiers {
    //
}

// access modifier : private, protected, public
// access level : private, protected, public, default

// public;
// eğer bir method veya özellik (class member veya alan) public olarak tanımlanmışsa,
// bu alana paketin içindeki ve dışındaki tüm class'lar erişebilir.

// default;
// eğer bir method veya özellik (class member veya alan) tanımlanırken hiçbir erişim belirteci kullanılmamışsa,
// bu alana sadece kendi paketindeki class'lar erişebilir.

// protected;
// eğer bir method veya özellik (class member veya alan) protected olarak tanımlanmışsa, bu alana
// aynı paketin içindeki diğer class'lar tarafından erişilebilir. paketin dışındaki class'lar ise
// sadece ve sadece bu alanın bulunduğu class'ın bir alt class'ı ise erişebilir.

// private;
// eğer bir method veya özellik (class member veya alan) private olarak tanımlanmışsa
// bu alana sadece kendi class'ı erişebilir.

// non-access
// final keyword'ü methodlar için anlamı; override edilemez!
// final; class, method, variable
// final sadece bir kere değer alır, aldığı değer bir daha değişmez.
// final ya ilk başta class içinde tanımlanırken değer alır ya da class'a ait constructor içinde değer alır.

// abstract;
// abstract; class, method için kullanılabilir, variable için KULLANILAMAZ!

// bir sınıfta bir tane bile abstract method varsa sınıf mutlaka abstract olmak zorundadır!

// synchronized -> methodlarda kullanılabilir, değişkenler(variable) için kullanılamaz.
// native -> methodlar için kullanılır.
// public native int hashCode();

// method içinde tanımlanan değişkenlere local değişken denir ve bu değişkenlere diğer methodlardan ve classlardan
// erişilemez. bundan dolayı bu değişkenlere access modifier eklenemez.
