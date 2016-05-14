package jp.blog.processingnyumon.basic;

import processing.core.PApplet;


public class Basic20 extends PApplet {

    public void setup() {
        size(640, 360);
        background(102);
    }

    public void draw() {
        stroke(255);
        if (mousePressed == true) {//mouseの左クリックが押されているとき
            line(mouseX, mouseY, pmouseX, pmouseY);
        }
    }
}

