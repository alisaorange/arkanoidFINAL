/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.processingformes.formes.mostraformes;

import com.mycompany.processingformes.formes.Ball;
import com.mycompany.processingformes.formes.Blocks;
import com.mycompany.processingformes.formes.Circle;
import com.mycompany.processingformes.formes.Pala;
//import com.mycompany.processingformes.formes.Rectangulo;
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
    private Blocks blocks;
    
    private Blocks blocks1;
    //String message = "this text is spinning";
    
    private int points = 0;
    private double lifes = 10;
    

    @Override
    public void settings() {
        size(800, 500);

    }

    @Override
    public void setup() {
        circle = new Ball(this, Color.red, new Point(100, 100), 10);
        pala = new Pala(this, Color.BLUE, new Point(150, 150), 100, 20);
        background(0);
        blocks = new Blocks(this, Color.GREEN, new Point(100, 100), 100, 10);
        blocks1 = new Blocks(this, Color.GREEN, new Point(450, 100), 100, 10);
        
    }

    @Override
    public void draw() {
        background(0);
        circle.dibuixa();
        pala.move();
        pala.dibuixa();
        blocks.dibuixa();
        blocks1.dibuixa();
        
         text("Points you have: ",30,20);
         text(points,130,20);
         
         text("Lifes you have: ",30,40);
         text((int)lifes,130,40);
   
          
        //System.out.println(pala.getP());
       // System.out.println(circle.getP());
       // System.out.println(circle.getSpeedx());

     //условие если шар сталкивается с ракеткой то отталкивается
    if((circle.getP().getX() > pala.getP().getX()) 
            && (circle.getP().getX() < pala.getP().getX() + 100) 
            && circle.getP().getY() + circle.getRadi() == pala.getP().getY()){
                 circle.setSpeedy(circle.getSpeedy()+1);
                 circle.setSpeedx(circle.getSpeedx()+1);
                 circle.setSpeedy(circle.getSpeedy() * -1);
          }
    
    
    //условие если мяч косается блока, он пропалает 
    if((circle.getP().getX() >= blocks.getP().getX()) 
            && (circle.getP().getX() <= blocks.getP().getX() + 100) 
            && ((circle.getP().getY() - circle.getRadi() == blocks1.getP().getY() + 10) || (circle.getP().getY() + circle.getRadi() == blocks1.getP().getY()))){
              //блок исчезает 
              //blocks.setC(Color.black);
              blocks.setP(new Point(-200, -200));
              points = points +1;  //при попадание по блоку +1 балл
          }
    //Блок 2. Надо придумать как создать много блоков (использовать цикл for)
     if((circle.getP().getX() >= blocks1.getP().getX()) 
            && (circle.getP().getX() <= blocks1.getP().getX() + 100) 
            && ((circle.getP().getY() - circle.getRadi() == blocks1.getP().getY() + 10) || (circle.getP().getY() + circle.getRadi() == blocks1.getP().getY()))){
              //блок исчезает 
              blocks1.setP(new Point(-200, -200));
              points = points +1;
          }
    //Если мяч не попадает по ракетке -1 жизнь.
    if( (circle.getP().getY() + circle.getRadi() == height) && ((circle.getP().getY() + circle.getRadi() - 1) == (height -1) )) { //500
        lifes = lifes - 0.5; //почему то вычиет 2 жизни, разобраться!!!
    }
  }
    

    public static void main(String[] args) {
        String[] processingArgs = {"Pilota"};
        MostraFormes pilota = new MostraFormes();
        PApplet.runSketch(processingArgs, pilota);
    }
}
