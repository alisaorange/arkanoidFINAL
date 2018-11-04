package com.mycompany.processingformes.formes;

import java.awt.Color;
import java.awt.Point;
import processing.core.PApplet;


/**
 *
 * @author kolos
 */
public class Pala extends Rectangulo {
    //final static int ALTURA = papplet.height - 20;
    
    public Pala(PApplet papplet, Color c, Point p, float anchura, float altura) {
        super(papplet, c, p, anchura, altura);
    }
    
    public void move(){
        int xP = papplet.mouseX;
            if(xP >= papplet.width-(int)getAnchura()){
               xP = papplet.width-(int)getAnchura();
            }        
        //int yP = papplet.height-(int)getAltura();
        int yP = papplet.height - 400;
       
        
        
        setP(new Point(xP, yP));
        
        
        
    }
}
