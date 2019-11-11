package com.kotlin._14.visibility

class TestClass {
    fun testing() {
        var referans: Ulus = Ulus()
        referans.c
        referans.d
    }
}

open class Ulus {
    private var a = 1
    protected var b = 2
    internal var c = 3
    public var d = 4

    open fun test() {
        println(a)
        println(b)
        println(c)
        println(d)
    }
}

class Turk : Ulus() {
    override fun test() {
        // println(a) -> private
        println(b)
        println(c)
        println(d)
    }
}

// access modifier : private, protected, public
// access level : private, protected, public, internal

// public;
// eğer bir method veya özellik (class member veya alan) public olarak tanımlanmışsa,
// bu alana paketin içindeki ve dışındaki tüm class'lar erişebilir.

// internal;
// eğer bir method veya özellik (class member veya alan) internal olarak tanımlanmışsa,
// bu alana sadece kendi paketindeki class'lar erişebilir.

// protected;
// eğer bir method veya özellik (class member veya alan) protected olarak tanımlanmışsa, bu alana
// aynı paketin içindeki diğer class'lar tarafından erişilebilir. paketin dışındaki class'lar ise
// sadece ve sadece bu alanın bulunduğu class'ın bir alt class'ı ise erişebilir.

// private;
// eğer bir method veya özellik (class member veya alan) private olarak tanımlanmışsa
// bu alana sadece kendi class'ı erişebilir.

// non-access

// final;
// final sadece bir kere değer alır, aldığı değer bir daha değişmez.
// kotlinde class'lar method'lar default olarak "public final"'dır.
// final class'da ve method'da inheritance işlemi yapılamaz.
// final yerine open kullanılmalıdır.
