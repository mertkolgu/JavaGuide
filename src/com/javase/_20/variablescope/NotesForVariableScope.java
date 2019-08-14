package com.javase._20.variablescope;

public class NotesForVariableScope {
    //
}

// static > instance > local
// scope'a göre sıralama

// static değişkenler class load edildiğinde hazırdır. proje durana kadar JVM çalıştığı sürece vardır.
// instance değişken obje varsa vardır, obje temizlenirse(Garbage Collection) bu değişken de uçar.
// local değişken metot çalışınca vardır, metot tamamlanınca uçar. (stack)