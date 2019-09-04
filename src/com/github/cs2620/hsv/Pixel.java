package com.github.cs2620.hsv;

import java.awt.Color;


public class Pixel {

    private int r, g, b;
    
    public Pixel(int i){
        int r = (i >> 16) & 0xff;
        int g = (i >> 8) & 0xff;
        int b = (i >> 0) & 0xff;
        
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public Pixel(Color inColor) {
        int r = inColor.getRed();
        int g = inColor.getGreen();
        int b = inColor.getBlue();
        
        this.r = r;
        this.g = g;
        this.b = b;

    }

    public Pixel(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public void toGrayscale() {
        int gray = (r + g + b) / 3;
        grayscale(gray);

    }

    public void toRed() {
        grayscale(r);
    }

    public void toGreen() {
        grayscale(g);
    }

    public void toBlue() {
        grayscale(b);
    }

    private void grayscale(int i) {
        r = i;
        g = i;
        b = i;
    }

    public Color getColor() {
        return new Color(r, g, b);
    }

}
