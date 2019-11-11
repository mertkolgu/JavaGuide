package com.javase._77.listresourcebundle;

import java.util.ListResourceBundle;

public class Message_tr extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{{"key1", "Merhaba, hoş geldiniz!"}, {"key2", "Hoşçakalın!"}};
    }
}

// public abstract class ListResourceBundle extends ResourceBundle
// abstract protected Object[][] getContents();
