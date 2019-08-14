package com.javase._46.classes;

public class NotesForClasses {
    //
}

// Legal değildir!
// bir source file'da sadece bir tane public class tanımlanabilir.
// public class ile source file (.java)'nın ismi aynı olmalıdır.
// public class NotWork {
//    //
// }

// bir sınıf public değilse default (package level)
class Legal {
    //
}

class Legal2 {
    //
}

// 1 - Non-static nested class (inner class)
// - a) regular inner class
// - b) local inner class
// - c) anonymous inner class
// 2 - Static Nested Classes
// 3 - Nested Interfaces

//---------------------------------------------------
// source file oluşumu;
// javada bir .java dosyası/bir sınıf derlediğinde .class dosyası olur.

// bu class için MyOuter.class dosyası oluşur!
// MyOuter$MyInner.class şeklinde bir dosya daha oluşur!!!!!
class MyOuter {
    class MyInner {
        //
    }
}

//---------------------------------------------------
// Mantıksal gruplama (logically grouping)
// bir sınıf/class sadece bir sınıf için anlamlıysa,
// bu durumda bu iki sınıfı mantıksal olarak gruplayabiliriz.
// bu iki sınıfı bir arada tutabiliriz. outer-inner ilişkisi içerisinde.

// Encapsulation artısı
// javada bir private değişkene sadece ilgili sınıftan erişim sağlanabilir.
// kalıtım da olsa bu değişkene erişim sağlanamaz!
// nested classlar outer classların private üyelerine (instance değişken/method) erişim sağlayabilir!!!
// kalıtımla bu özellik sağlanamaz!!!
// kodun readable/okunabilirlik, maintainable/sürdürülebilirlik özelliğine katkı sağlar.