package jp.blog.processingnyumon.basic;

import processing.core.PApplet;


public class Basic21 extends PApplet {

    public void setup() {
        size(640, 360);
        stroke(255);
        noFill();
    }

    public void draw() {
        background(0);
        bezier(mouseX, mouseY, 410, 20, 440, 300, 240, 300);
        ellipse(mouseX,mouseY,10,10);
        ellipse(410,20,10,10);
        ellipse(440,300,10,10);
        ellipse(240,300,10,10);
    }
}

