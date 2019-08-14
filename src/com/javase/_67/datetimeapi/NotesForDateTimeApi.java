package com.javase._67.datetimeapi;

public class NotesForDateTimeApi {
    //
}

// The new Java date and time API is provided in the java.time package. This new
// API in Java 8 replaces the older classes supporting date- and time-related
// functionality such as the Date, Calendar, and TimeZone classes provided as
// part of the java.util package.

// java.time paketinde yer almaktadırlar!
// java.util paketinde yer alan Date Calendar TimeZone gibi sınıflar yerine kullanılmalıdır!

// problemler;

// - Date sınıfı hem tarihi (date) hem saati/zamanı (time) tutmakta.
// - günler 1-31 aralığında olabilirken, aylar 0-11 aralığında olmakta (ocak -> 0, aralık -> 11)
// - Date, SimpleDateFormatter gibi sınıflar thread safe değil!

// Java'8 de gelen sınıfların çoğunluğu immutable vve thread safe olmaktadır.