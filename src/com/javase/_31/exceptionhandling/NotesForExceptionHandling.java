package com.javase._31.exceptionhandling;

public class NotesForExceptionHandling {
    //
}

// exception handling -> istisna yönetimi
// try, catch, finally, throw, throws şeklinde keywordler yer almaktadır.

// exception -> istisna
// error -> hata

// java.lang.Exception
// java.lang.Error

// try-catch
// genel format

// try {
// riskli kod bloğu
// } catch(Exception1 ex1) {
//
// } catch(Exception2 ex2) {
//
// } catch(Exception3 ex3) {
//
// }

// Java'da Exceptionlar Class'dır.
// java.lang.ArithmeticException
// java.lang.RuntimeException
// java.lang.Exception
// java.lang.Throwable

// Exception Türleri

// Checked(Kontrollü) Exception -> Runtime Exceptionlardan türemeyen her class "Checked Exception" kapsamına girer ve
// Java kodların exception fırlatabileceğini öngörür. Bu hataları yakalamazsak Java bize bu hataları yakalamamızı
// söyler. Örnek; IOException, SQLException

// UnChecked(Kontrolsüz) Exception -> Runtime Exceptionlardan türeyen her class "UnChecked Exception" kapsamına girer
// ve programı çalıştırmadan önce kontrol edilemezler. Yani Java bu exception'ı öngöremez. Hataları yakalama
// programcının sorumluluğundadır. Örnek; ArithmeticException, NullPointerException

// Error -> Geri dönülemez ve tamir edilemeyen hatalardır. Örnek; OutOfMemoryError