package com.javase._11.polymorphism;

public class OverloadedExampleCircle {
    private int xPos;
    private int yPos;
    private int radius;

    public OverloadedExampleCircle(int x, int y, int r) {
        xPos = x;
        yPos = y;
        radius = r;
    }

    public OverloadedExampleCircle(int x, int y) {
        xPos = x;
        yPos = y;
        radius = 10;  // default radius
    }

    public OverloadedExampleCircle() {
        xPos = 20;
        yPos = 20;
        radius = 10;
    }
}
