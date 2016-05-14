package jp.blog.processingnyumon.basic;

import processing.core.PApplet;


public class Basic26 extends PApplet {

    float bx;
    float by;
    int boxSize = 75;
    boolean overBox = false;
    boolean locked = false;
    float xOffset = 0.0f;
    float yOffset = 0.0f;

    public void settings() {

        size(640, 360);
    }

    public void setup() {
        bx = width/2.0f;
        by = height/2.0f;
        rectMode(RADIUS);
    }

    public void draw() {
        background(0);

        if (mouseX > bx-boxSize && mouseX < bx+boxSize &&
                mouseY > by-boxSize && mouseY < by+boxSize) {
            overBox = true;
//mouseがBOXの範囲に入っているとoverBoxをtrueにする。
            if(!locked) {
                stroke(255);
                fill(153);
//mousePressされいない場合、線だけ白にする。
            }
        } else {
            stroke(153);
            fill(153);
            overBox = false;
        }
        rect(bx, by, boxSize, boxSize);

    }

    public void mousePressed() {
        if(overBox) {
            locked = true;
//もしmouseがBOXの範囲内ならば
            fill(255, 255, 255);
        } else {
            locked = false;
        }
        xOffset = mouseX-bx;
        yOffset = mouseY-by;
//mouseX,Yとbx,byの差を出す。
    }

    public void mouseDragged() {
        if(locked) {
//もしmouseがBOXの範囲内ならば
            bx = mouseX-xOffset;
            by = mouseY-yOffset;
//boxの位置をずらす。
        }
    }

    public void mouseReleased() {
        locked = false;
    }
}

