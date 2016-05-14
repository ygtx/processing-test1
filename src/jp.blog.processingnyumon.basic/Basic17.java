package jp.blog.processingnyumon.basic;

import processing.core.PApplet;


public class Basic17 extends PApplet {

    float xoff = 0;
    float xincrement = 0.01f;
    float yoff = 0;
    float yincrement = 0.02f;

    public void setup() {
        size(640, 360);
        background(0);
        noStroke();
    }

    public void draw()
    {
        //軌道を残します。
        fill(0, 10);
        rect(0,0,width,height);


        // offのノイズを発生させ、widthを掛けています。noiseの戻り値は0~1の間です。
        float n = noise(xoff)*width;
        float m = noise(yoff)*height;

        //offを増加させます。
        xoff += xincrement;
        yoff += yincrement;

        // 円を描きます。
        fill(200);
        ellipse(n,m, 64, 64);
    }
}

