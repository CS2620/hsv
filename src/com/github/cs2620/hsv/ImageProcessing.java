
package com.github.cs2620.hsv;

public class ImageProcessing {

   
    public static void main(String[] args) {
        //Get out of a static context by create a new instance of this class
        new ImageProcessing();
    }

    public ImageProcessing() {
        
        System.out.println("Running program.");

        //Load my image
        MyImage myImage = new MyImage("in.jpg");

        //Call a pixel modifier on each pixel
       myImage.all(Pixel::lessSaturated);

        //Save the image
        myImage.save("out.png");

        System.out.println("Done running.");

       
    }
}
