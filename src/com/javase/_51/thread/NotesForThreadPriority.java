package com.javase._51.thread;

public class NotesForThreadPriority {
    //
}

// Thread'lerin sahip olduğu priority/öncelik değeri vardır.
// Bu değer genel olarak 1-10 arasında olur.

// public static final int MIN_PRIORITY = 1;
// public static final int NORM_PRIORITY = 5;
// public static final int MAX_PRIORITY = 10;

// priority/önceliği yüksek olan thread'lerin önce çalışmasını bekleriz.
// fakat bunun %100 garantisi yoktur.

// birçok thread oluşturduğumuzda JVM ve OS bu thread'lerin
// ne zaman çalışacağını ve ne zaman başlayacağını kendisi belirler.
// ayrıca thread'lerin çalışma sırası ve başlatılma sırası farklı olabileceği için
// programlarımızda ortaya çıkan çıktılar farklılık gösterebilir.