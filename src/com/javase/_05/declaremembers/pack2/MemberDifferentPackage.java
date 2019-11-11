package com.javase._05.declaremembers.pack2;

import com.javase._05.declaremembers.pack1.ModifierMember;

public class MemberDifferentPackage {

    public static void main(String[] args) {
        ModifierMember mb = new ModifierMember();
        // System.out.println(mb.defaultNumber);    // compile error
        System.out.println(mb.publicNumber);
        // System.out.println(mb.protectedNumber);  // compile error
        // farklı paketten sadece public'e erişim sağlanabilir!
    }
}
