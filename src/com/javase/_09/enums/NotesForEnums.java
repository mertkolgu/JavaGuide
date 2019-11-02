package com.javase._09.enums;

public class NotesForEnums {
    //
}

// enum -> keyword
// enumaration -> sıralı, listeli, numaralı gibi anlamlara gelir.
// bir değişkenin alabileceği değerleri sınırlandırabiliyorsak bu durumda enum kullanmayı tercih edebiliriz.

// Month -> 12 tane değer alabilir.
// DayOfWeek -> 7 tane gün değeri alabilir.

// Employee Tipleri olsun :
// 1 - Full time
// 2 - Part time
// 3 - stajyer
// 4 - danışman

// Kredi kartları
// VISA
// MASTERCARD
// DINERS
// AMEX

// public String VISA = "VISA";
// public String MASTERCARD = "MASTERCARD";

// bu şekilde kullanmak yerine enum'ları tercih ederiz!!!

// "visa".equals(VISA) bu kod hatalı/buglı
// enumlar ile çalışırken böyle bir RİSK yok!!!

// SHORT, MEDIUM, LARGE, XLARGE...

// SHORT, TALL, GRANDE, VENTI...

// enum'lar java.lang.Enum sınıfını (public abstract class Enum<E extends Enum<E>>)
// kalıtmaktadır. dolayısıyla bir başka sınıfı kalıtamaz.
