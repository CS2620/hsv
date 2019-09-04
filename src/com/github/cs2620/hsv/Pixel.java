package com.github.cs2620.hsv;

import java.awt.Color;


public class Pixel {

    private int r, g, b;
    
    public Pixel(int i){
        int r = 0;
        int g = 0;
        int b = 0;
        
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
