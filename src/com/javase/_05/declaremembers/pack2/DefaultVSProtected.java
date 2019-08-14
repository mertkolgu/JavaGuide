package com.javase._05.declaremembers.pack2;

import com.javase._05.declaremembers.pack1.ModifierMember;

// default ile protected'ın farkı, farklı paketler olduğunda ve kalıtım olduğunda ortaya çıkar.
public class DefaultVSProtected extends ModifierMember {

    void testMethod() {
        // kalıtım yoluyla protected'a erişim sağlanabilir!
        // default ise sağlanmaz.
        // System.out.println(defaultNumber);
        System.out.println(publicNumber);
        System.out.println(protectedNumber);
    }
}