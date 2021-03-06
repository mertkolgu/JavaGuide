package com.javase._46.hashcode;

public class NotesForHashCode {
    //
}

// public native int hashCode();
// bu metot arka planda JVM tarafından implement edilmektedir.
// DİKKAT native bir keyworddür.

// int, 32 bit signed.
// objenin id bilgisi gibi düşünebiliriz.

// HashMap, Hashtable, HashSet gibi Collection yapıları
// objelerin saklanması/store noktasında hashCode değerinden faydalanır.

// hashCode kullanan veri yapıları kullandığımızda,
// hashCode metoduyla birlikte equals'i beraber override edebiliriz.

// x.equals(y) true ise
// x.hashCode() == y.hashCode() true olmalıdır.

// x.equals(y) == false ise
// x.hashCode() == y.hashCode() true ya da false olabilir.


// x.hashCode() == y.hashCode() ise
// x.equals(y) == true ya da false olabilir.
