package jp.blog.processingnyumon.basic;

import processing.core.PApplet;


public class Basic22 extends PApplet {

    int totalPts = 300;//点の個数
    float steps = totalPts + 1;

    public void settings() {
        size(640, 360);
    }

    public void setup() {
        stroke(255);
        frameRate(1);//１秒間に１回描写
    }

    public void draw() {
        background(0);
        float rand = 0;
        for  (int i = 1; i < steps; i++) {
            point( (width/steps) * i, (height/2) + random(-rand, rand) );
            //pointのx軸はforが進むごとに少しずつ増加していく。
            rand += random(-5, 5);//Y軸を-5～+5の間で足していく。
        }
    }
}

