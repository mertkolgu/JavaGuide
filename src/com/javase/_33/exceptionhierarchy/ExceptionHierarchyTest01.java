package com.javase._33.exceptionhierarchy;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionHierarchyTest01 {

    public static void main(String[] args) throws IOException {

        // FileWriter fw = new FileWriter("folders/dosya.txt");
        // bir metodu/constructor'ı çağırdığımızda ve bu metod/constructor bir checked
        // exception fırlatma riski taşıdığında(throws ifadesi barındırdığında)
        // bu durumda compiler bize derleme hatası verir.

        // eclipse seçenek sunmaktadır.
        // handle or declare rule adı verilir.

        // handle -> try-catch
        // declara -> throws
        // bu kural sadece Checked Exception'lar için zorunludur.

        try {
            FileWriter fw = new FileWriter("folders/dosya.txt");
        } catch (IOException e) {
            e.printStackTrace();    // hatanın türünü ekrana basar
        }

        FileWriter fw = new FileWriter("folders/dosya.txt");
        FileWriter fw2 = new FileWriter("folders/dosya.txt");
        FileWriter fw3 = new FileWriter("folders/dosya.txt");
        // bir kere throws ettiğimizde artık try-catch arasına almamız gerekmez.
    }
}

// throws keywordü method/constructor deklarasyonunda/ifadesinde/tanımlamasında kullanılabilir.

// IOException bir checked exception'dur.

// throws anlamı -> ben X hatasını FIRLATABİLİRİM! anlamına gelir.
// kesin fırlatılacak diye bir şey yok, böyle bir risk var anlamına gelir.

// public FileWriter(String fileName) throws IOException {
//      super(new FileOutputStream(fileName));
// }