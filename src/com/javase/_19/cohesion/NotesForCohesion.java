package com.javase._19.cohesion;

public class NotesForCohesion {

    public void method1() {
        // t process
        // x process
    }

    public void method2() {
        // t process
        // y process
    }

    public void method3() {
        // t process
        // w process
    }

    public void method4() {
        // t process
        // z process
    }

    public void method5ForProcessT() {
        // 4 metot için duplicate code yazmak yerine yeni bir metot oluştur bu metodu çağır kullan
    }

    public void batchJob() {
        // bir metot içerisinde UZUN UZUN business code yazma!
        // bunları BÖL!

        // job1
        // job2
        // job3
        // job4
        // KÖTÜ BİR YAKLAŞIM

        // DOĞRU yaklaşım
        job1();
        job2();
        job3();
        job4();
    }

    public void job1() {
        //
    }

    public void job2() {
        //
    }

    public void job3() {
        //
    }

    public void job4() {
        //
    }
}

// high cohesion istenen durumdur.

// cohesion, bir sınıfın/classın tasarımı/design ile ilgilidir.
// her sınıf/class iyi tanımlanmış bir göreve sahip olmalıdır.
// class içerisinde birbirleriyle alakasız metotlar OLMAMALIDIR.

// classları ve metotları olabildiğince böl.
// classlardaki metotları mantıklı makul şekilde gruplandırabiliriz.
// metotları da mümkün mertebe bölmek! her metot tek iş yapsın.
