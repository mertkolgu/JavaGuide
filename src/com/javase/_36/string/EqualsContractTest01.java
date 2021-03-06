package com.javase._36.string;

public class EqualsContractTest01 {

    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        System.out.println(i1 == i2);   // false
        System.out.println(i1.equals(i2));  // true

        StringBuffer sb1 = new StringBuffer("not-equals");
        StringBuffer sb2 = new StringBuffer("not-equals");

        System.out.println(sb1.equals(sb2));    // false
        // StringBuffer sınıfında equals metodu override edilmemiştir false döner!

        System.out.println(sb1.toString().equals(sb2.toString()));  // true
    }
}

// java.lang.Object sınıfında yer alan equals metodu

// public boolean equals(Object obj) {
//      return (this == obj);
// }
// buradaki equals metodu == ile aynı anlama gelmektedir.
// yani bu iki referans değişken aynı objeyi mi gösteriyor?
