/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.processingformes.formes;

import java.awt.Color;
import java.awt.Point;
import processing.core.PApplet;

/**
 *
 * @author prof
 */
public class Circle extends Shape {

    private float radi;
    private int speedx = 5;
    private int speedy = 5;

    public int getSpeedx() {
        return speedx;
    }

    public void setSpeedx(int speedx) {
        this.speedx = speedx;
    }

    public int getSpeedy() {
        return speedy;
    }

    public void setSpeedy(int speedy) {
        this.speedy = speedy;
    }


    public Circle(PApplet papplet, Color c, Point p, float radi) {
        super(papplet, c, p);
        this.radi = radi;
    }

    public float getRadi() {
        return radi;
    }

    public void setRadi(float radi) {
        this.radi = radi;
    }

    public void dibuixa() {
        papplet.fill(getC().getRGB());
        //papplet.ellipse((float) getP().getX(), (float) getP().getY() , 2*radi, 2*radi );
        int xC = (int) getP().getX();
        int yC = (int) getP().getY();
        
        if ((xC > papplet.width - radi) || (xC < radi)) {
            speedx *= -1;
        }
        if ((yC > papplet.height - radi) || (yC < radi)) {
            speedy *= -1;
        }
        
        //Если у шара и палы точки равны
        //if( xC == pala.getP().getX()){  
         //   setSpeedx(getSpeedx() * -1);
        //}
        
        
        
        this.setP(new Point(xC+speedx,yC+speedy)); 
        papplet.ellipse(xC, yC, 2 * radi, 2 * radi);
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
