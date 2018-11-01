/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.processingformes.formes.mostraformes;

import com.mycompany.processingformes.formes.Ball;
import com.mycompany.processingformes.formes.Circle;
import com.mycompany.processingformes.formes.Pala;
import java.awt.Color;
import java.awt.Point;
import processing.core.PApplet;

/**
 *
 * @author prof
 */
public class MostraFormes extends PApplet {

    private Circle circle;
    private Pala pala;

  
    
    @Override
    public void settings() {
        size(800, 600);
        
    }

    @Override
    public void setup() {
        circle = new Ball(this, Color.red, new Point(100, 100), 20);
        pala = new Pala (this, Color.BLUE, new Point(150, 150), 100, 20);
        background(0);
    }

    @Override
    public void draw() {
        background(0);
        circle.dibuixa();
        pala.move();
        pala.dibuixa();
        
    }

    public static void main(String[] args) {
        String[] processingArgs = {"Pilota"};
        MostraFormes pilota = new MostraFormes();
        PApplet.runSketch(processingArgs, pilota);
    }
}