package com.javase._13.polymorphism;

public class CircleBestExample {
    private int xPos;
    private int yPos;
    private int radius;

    public CircleBestExample(int x, int y, int r) {
        xPos = x;
        yPos = y;
        radius = r;
    }

    public CircleBestExample(int x, int y) {
        this(x, y, 10); // default radius
    }

    public CircleBestExample() {
        this(20, 20, 10);
    }
}

// bu yaklaşım daha güzel bir yaklaşımdır
// constructorları overloaded ettiğimizde reusable olarak kullanabiliriz.
