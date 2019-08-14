package com.javase._72.listresourcebundle;

import java.util.ListResourceBundle;

public class Message_en extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{{"key1", "Hello Welcome!!!"}, {"key2", "Good Bye!!!!"}};
    }
}

// public abstract class ListResourceBundle extends ResourceBundle
// abstract protected Object[][] getContents();