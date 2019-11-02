package com.javase._68.multicatch;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiCatchTest01 {

    public static void main(String[] args) {

        // multi-catch Java 7 ile birlikte gelen bir özellik.

        try {
            testMethod();
        } catch (FileNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        // catch(Exception1 e | Exception2 e | Exception3 e) // DOES NOT COMPILE
        // catch(Exception1 e1 | Exception2 e2 | Exception3 e3) // DOES NOT COMPILE
        // catch(Exception1 | Exception2 | Exception3 e)

        try {
            testMethod();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // legal değildir.
        // multi-catch bloğunda birden aralarında IS-A ilişkisi olan exception tiplerini kullanamayız, legal değildir.
        // FileNotFoundException IS-A IOException
        // FileNotFoundException extends IOException
        // try {
        //     //
        // } catch (FileNotFoundException | IOException e) { } // DOES NOT COMPILE
    }

    public static void testMethod() throws FileNotFoundException, SQLException {
        //
    }
}