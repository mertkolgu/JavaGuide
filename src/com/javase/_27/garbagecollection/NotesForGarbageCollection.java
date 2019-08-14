package com.javase._27.garbagecollection;

public class NotesForGarbageCollection {
    //
}

// Herhangi bir program/application çalıştığında kaynak tüketir.
// memory/RAM ve CPU

// Operating System bilgisayarımızda kaynakları yönetmekten sorumludur.
// Operating System ülke yöneticisi gibi düşünebiliriz.
// JVM'e belli bir kaynak ayrılır.

// C gibi bir dilde calloc, malloc, free gibi metotları/fonksiyonları kullanırız.
// Java'da ise bu işlem Garbage Collector tarafından otomatik olarak yapılmaktadır.
// Objeler için kendimiz alan oluşturup alan boşaltamayız, bu işlemi Java'ya bırakırız.

// Bu işlem developerdan alındığı için, memory-leak'lere karşı önlem alınmış olur.
// Bu özellik Java'nın Robust/güçlü/dirençli özelliğine katkı sağlar.

// Pointerlarla uğraşmadığımız için, Java'nın Simple/basit özelliğini sağlamaktadır.

// JVM, OS'den memory allocate eder.

// Bir objenin sahibi yoksa/erişen reference değişken yoksa bu noktada obje temizlenmeye/silinmeye uygun hale gelir.