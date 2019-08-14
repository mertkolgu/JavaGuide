package com.javase._33.exceptionhierarchy;

public class NotesForExceptionHierarchy {
    //
}

// Java'da primitive tipler hariç her şey objedir.
// Exceptionlar da objedir.

// Throwable alt sınıfları;
// java.lang.Exception
// java.lang.Error

// java.lang.RuntimeException

// java.lang.OutOfMemoryError : Permgen space
// StackOverFlowError

// Error'ları yakalamak gibi bir derdimiz yoktur! (catch)

// Error'lar ve RuntimeException'lar unchecked tipindedir
// diğer sınıflar ise Exception ve RuntimeException'ını kalıtmayan exceptionlar, Throwable ise checked tipindedir.