package com.mycompany.processingformes.formes;

import static com.mycompany.processingformes.formes.Shape.papplet;
import java.awt.Color;
import java.awt.Point;
import processing.core.PApplet;


/**
 *
 * @author kolos
 */
public class Blocks extends Rectangulo {
    
    private boolean exist = true; 

    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }
    
    
    
    public Blocks(PApplet papplet, Color c, Point p, float anchura, float altura) {
        super(papplet, c, p, anchura, altura);
    }
    
  
}
