package com.javase._73.multicatch;

import java.sql.SQLException;

public class MultiCatchTest02 {

    public static void main(String[] args) {
        try {
            //
        } catch (Exception e) {
            //
        }
        // catch bloğunda bir checked exception'un yer alabilmesi için
        // try bloğunda ilgili hatanın fırlatılması ya da riski yer alması
        // gereklidir.
        try {
            testMethod();
        } catch (SQLException e) {
            //
        }
        // Java will not allow you to declare a catch block for a checked
        // exception type that cannot potentially be thrown by the try clause
        // body. This is again to avoid unreachable code.
    }

    public static void testMethod() throws SQLException {
        //
    }
}
