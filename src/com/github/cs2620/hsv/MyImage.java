package com.github.cs2620.hsv;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class MyImage {
    
    BufferedImage bufferedImage;
    
    /**
     * Create a new image instance from the given file
     * @param filename The file to load
     */
    public MyImage(String filename){
        try {
            bufferedImage = ImageIO.read(new File(filename));
        } catch (IOException ex) {
            Logger.getLogger(MyImage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Run a pixel operation on each pixel in the image
     * @param pi The pixel operation to run
     */
    public void all(PixelInterface pixelInterface){
        
         for(int y = 0; y < bufferedImage.getHeight(); y++){
            for(int x = 0; x < bufferedImage.getWidth(); x++){
                int color_int = bufferedImage.getRGB(x, y);
                
                Pixel p = new Pixel(color_int);
                
                pixelInterface.PixelMethod(p);
                
               bufferedImage.setRGB(x,y,p.getColor().getRGB());
                
            }
        }
        
    }
    
    /**
     * Save the file to the given location
     * @param filename The location to save to
     */
    public void save(String filename){
        
        try {
            ImageIO.write(bufferedImage, "PNG", new File(filename));
        } catch (IOException ex) {
            Logger.getLogger(MyImage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
