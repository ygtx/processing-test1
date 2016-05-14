package jp.blog.processingnyumon.basic;

import processing.core.PApplet;


public class Basic24 extends PApplet {

    float xoff;
    float yoff;
    float theta;

    public void settings() {
        size(300,300);
    }

    public void setup(){
        background(255);
    }

    public void draw(){
        translate(width/2,height/2);

        fill(255);

        line(0, 0, 230 * cos(theta) * noise(xoff,yoff), 230 * sin(theta) * noise(xoff,yoff));

        theta+=0.01;
        xoff+=0.001;
        yoff+=0.005;

        if (theta > TWO_PI) {
            noLoop();
        }

    }
}

