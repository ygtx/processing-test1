package jp.blog.processingnyumon.basic;

import processing.core.PApplet;


public class Basic23 extends PApplet {

    int totalPts = 300;//点の個数
    float steps = totalPts + 1;

    public void setup() {
        size(400,500);
        noLoop();
    }

    public void draw() {

        fill(255);
        rect(0,0,width,height);

        for (int y = 0; y < height; y++) {
            float x = randomGaussian() * 15;
            line(width/2, y, width/2 + x, y);
        }

        println(randomGaussian());
    }

    public void mousePressed(){
        redraw();
    }
}

