package com.javase._03.declareclass.pack1;

import com.javase._03.declareclass.pack2.Public2;   // Public2 sınıfı public olduğu için erişim sağlanır!
// farklı paketten eriştiğimiz için import etmemiz gerekli.

// import com.javase._03.declareclass.pack2.Default2;   // compile error
// sınıf public değilse farklı paketten erişim sağlanamaz.

public class Public {

    void testMethod() {
        // Default2 def = new Default2();
        Public2 pb2 = new Public2();
    }
}