package com.javase._47.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest11 {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();

        nameList.add("mert");
        nameList.add("necati");
        nameList.add("ali");

        Object[] array1 = nameList.toArray();
        String[] stringArray1 = nameList.toArray(new String[nameList.size()]);

        nameList.add("new element!");
        System.out.println(nameList);   // [mert, necati, ali, new element!]

        for (String e : stringArray1)
            System.out.println(e);
        // mert
        // necati
        // ali
    }
}
