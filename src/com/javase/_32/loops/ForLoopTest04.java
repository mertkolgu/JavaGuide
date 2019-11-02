package com.javase._32.loops;

class Loop {
    private String isim;

    public Loop(String isim) {
        this.isim = isim;
    }

    public void yaz() {
        System.out.println(this.isim);
    }
}

public class ForLoopTest04 {

    public static void main(String[] args) {
        Loop[] array = {new Loop("Mert"), new Loop("Ecir")};

        for (Loop l : array)
            l.yaz();
    }
}
