package com.mycompany.processingformes.formes;

import java.awt.Color;
import java.awt.Point;
import processing.core.PApplet;


/**
 *
 * @author kolos
 */
public class Ball extends Circle {
    
    public Ball(PApplet papplet, Color c, Point p, float radi) {
        super(papplet, c, p, radi);
    }
     
    ///////////////
    //Кароче, дело к ночи)) Я хочу сравнить точку на по Х у мяча  и у Ракетки, если они совпадают то значит был удар и надо "отскочить"
    // я все еще не до конца вкуриваю работу гет и сет. Я хочу получать положение мяча, тут просто getP() потому что getP() в данном классе это
    //данные о мяче? А чтобы получить точку ракетки (Pala) нужно что то вроде pala.getP()?  Но точка Х ракетки зависит от положения мышки и прописано в
    //классе Pala, который "зависит" от класса Rectangulo, а тот в свою очередь от класса Shape, к которму у мяча есть доступ через класс Circle... 
    //Где искать данные о ракетки и правильно ли я все понимаю?
    
    //Pala pala = new Pala();
    
    public void choce(){
        if(pala.getP() = getP()){
           ball.getSpeedx() *= -1;
        }
    }
    
}
