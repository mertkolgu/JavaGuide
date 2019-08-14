package com.javase._71.propertyresourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class PropertyResourceBundleTest {

    public static void main(String[] args) {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("config", new Locale("tr"));
        String msg = resourceBundle.getString("message");
        System.out.println(msg);

        ResourceBundle resourceBundleEN = ResourceBundle.getBundle("config", new Locale("en"));
        String msg2 = resourceBundleEN.getString("message");
        System.out.println(msg2);

        ResourceBundle resourceBundle3 = ResourceBundle.getBundle("com.myjavase._71.propertyresourcebundle.file", new Locale("tr"));
        String msg3 = resourceBundle3.getString("property.key");
        System.out.println(msg3);

        ResourceBundle resourceBundle4 = ResourceBundle.getBundle("com.myjavase._71.propertyresourcebundle.file", new Locale("en"));
        String msg4 = resourceBundle4.getString("property.key");
        System.out.println(msg4);
    }
}

// public class PropertyResourceBundle extends ResourceBundle
// public abstract class ResourceBundle

// java.util.MissingResourceException

// - dosyaların uzantısı properties olacak!
// dosya isminin genel formatı dosyaIsmi_localeBilgisi.properties