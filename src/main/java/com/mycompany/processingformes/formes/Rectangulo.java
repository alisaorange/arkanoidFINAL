package com.mycompany.processingformes.formes;

import java.awt.Color;
import java.awt.Point;
import processing.core.PApplet;

public class Rectangulo extends Shape {
    
    private float anchura; 

    public float getAnchura() {
        return anchura;
    }

    public void setAnchura(float anchura) {
        this.anchura = anchura;
    }
    
    private float altura;
    
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }


    
     public Rectangulo(PApplet papplet, Color c, Point p, float anchura, float altura) {
        super(papplet, c, p);
        this.anchura = anchura;
        this.altura = altura;
    }
     
    public void dibuixa(){
        papplet.fill(getC().getRGB());
        //papplet.rect((float) getP().getX(), (float) getP().getY(), width, height);   
        
        int xP = (int) getP().getX();
        int yP = (int) getP().getY();
        
        
        //papplet.rect(papplet.mouseX, papplet.mouseY, width, height); 
        papplet.rect(xP, yP, anchura, altura); // как вместо 600-высота, поставить переменную???
        //Что делает вычитание из мышьХ ширину/2 окна???
        //(width-30, mouseY-rectSize/2, 10, rectSize)
    }
    
    @Override
    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double perimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
