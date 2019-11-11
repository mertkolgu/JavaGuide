package com.javase._58.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiamondSyntaxTest01 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();

        // diamond syntax generic !
        List<String> namesV2 = new ArrayList<>();

        Map<String, Integer> map = new HashMap<String, Integer>();
        Map<String, Integer> mapV2 = new HashMap<>();
        // To simplify your life, Java 1.7 introduced the diamond syntax, in which the
        // type parameters may be omitted:
    }
}
