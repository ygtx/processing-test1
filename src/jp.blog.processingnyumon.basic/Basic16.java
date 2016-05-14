package jp.blog.processingnyumon.basic;

import processing.core.PApplet;


public class Basic16 extends PApplet {

    int gridSize = 40;

    public void setup() {
        size(640, 360);
        background(0);
        noStroke();
        noLoop();
    }
    public void draw() {

        for (int x = gridSize; x <= width - gridSize; x += gridSize) {
            for (int y = gridSize; y <= height - gridSize; y += gridSize) {
                noStroke();
                fill(255);
                ellipse(x, y, 3, 3);
                stroke(255, 50);
                line(x, y, width/2, height/2);
            }
        }
    }
}

