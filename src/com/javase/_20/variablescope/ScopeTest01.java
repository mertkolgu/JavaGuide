package com.javase._20.variablescope;

public class ScopeTest01 {

    public static void main(String[] args) {

        Scope scope = new Scope();
        scope.onIleCarp();

        System.out.println("*************");

        Scope2.innerClass innerClass = new Scope2().new innerClass();
        innerClass.onIleCarp();
    }
}

class Scope {
    private int privateDegisken = 30;

    public Scope() {
        System.out.println("Private Değişken = " + privateDegisken);
    }

    public void onIleCarp() {
        int privateDegisken = 10;   // local variable

        for (int i = 1; i < 6; i++) {   // methoda ait privateDegiskeni kullanır
            System.out.println(i + " x " + privateDegisken + " = " + (i * privateDegisken));    // 10
        }

        System.out.println("*************");

        for (int i = 1; i < 6; i++) {   // Scope class'ına ait privateDegiskeni kullanır
            System.out.println(i + " x " + this.privateDegisken + " = " + (i * this.privateDegisken));  // 30
        }
    }
}

class Scope2 {
    private int privateDegisken = 30;

    public Scope2() {
        //
    }

    public void innerClassTest() {
        innerClass innerClass = new innerClass();
        System.out.println("Kontrol ediliyor : " + innerClass.a);
    }

    public class innerClass {
        private int privateDegisken = 20;
        private int a = 3;

        public void onIleCarp() {
            int privateDegisken = 10;

            for (int i = 1; i < 6; i++) {   // methoda ait privateDegiskeni kullanır
                System.out.println(i + " x " + privateDegisken + " = " + (i * privateDegisken));    // 10
            }

            System.out.println("*************");

            for (int i = 1; i < 6; i++) {   // innerClass class'ına ait privateDegiskeni kullanır
                System.out.println(i + " x " + this.privateDegisken + " = " + (i * this.privateDegisken));  // 20
            }

            System.out.println("*************");

            for (int i = 1; i < 6; i++) {   // Scope2 class'ına ait privateDegiskeni kullanır
                System.out.println(i + " x " + Scope2.this.privateDegisken + " = " + (i * Scope2.this.privateDegisken));    // 30
            }
        }
    }
}