package com.javase._45.tokenizing;

public class NotesForTokenizing {

    public static void main(String[] args) {
        String content = "key1,key2,key3,key4";
        String[] keys = content.split(",");

        for (String key : keys)
            System.out.println(key);
        // key1
        // key2
        // key3
        // key4

        String content1 = "key1,key2:key3;key4,key5.key6";
        String[] keys1 = content1.split(",|:|;|\\.");   // virgül, noktalı virgül, iki nokta üst üsteye göre split et
        // nokta için \\. kaçış karakterini kullanmamız gereklidir.
        for (String key : keys1)
            System.out.println(key);
        // key1
        // key2
        // key3
        // key4
        // key5
        // key6
    }
}

// java.lang.String
// java.lang.StringTokenizer

// Token -> simge , sembol
// büyük parçaları küçük parçalara böl!
