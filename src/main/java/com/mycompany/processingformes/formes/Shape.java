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
public abstract class Shape {
    private Color c;
    private Point p;
    protected static PApplet papplet;

    public Shape(PApplet papplet, Color c, Point p) {
        this.c = c;
        this.p = p;
        this.papplet = papplet;
    }

//<editor-fold defaultstate="collapsed" desc="GETTERS/SETTERS">
    public Color getC() {
        return c;
    }
    
    public void setC(Color c) {
        this.c = c;
    }
    
    public Point getP() {
        return p;
    }
    
    public void setP(Point p) {
        this.p = p;
    }
//</editor-fold>
    
    public abstract double area();
    
    public abstract double perimeter();
    
}