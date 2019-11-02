package com.javase._56.thread;

public class NotesForSynchronized {
    //
}

// synchronized javada bir keyword'tür.

// synchronized anahtar kelimesi metotlarda ya da blocklarda kullanılabilir.
// javada senkronizasyon mekanizması lock/kilit mekanizması ile çalışır.

// javada her objenin bir kilidi/lock'ı vardır.
// monitor lock, intrinsic(esas/asıl) lock olarak ifade edilir.
// her obje için sadece bir tek kilit/lock vardır.

// synchronized bir metoda thread girdiği zaman objenin kilidini ele geçirir alır.
// bir thread bir objenin kilidini ele geçirdikten sonra bırakana kadar
// (release) bir başka thread bu objenin kilidini alamaz.

// - her objenin bir tek kilidi vardır
// - bir thread N tane kilidi ele geçirebilir.
// - bir thread ilgili objenin kilidini bırakmadan bir başka thread bu objenin kilidini ele geçiremez.
// yani thread'in işi bitmeden bir başka thread synchronized metoda giremez.
// (aynı obje üzerinde çalışan N tane thread için)
