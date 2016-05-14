package jp.blog.processingnyumon.basic;

import processing.core.PApplet;
import processing.core.PFont;


public class Basic19 extends PApplet {

    PFont f;

    public void setup() {
        size(640, 360);
        f = createFont("Arial",16,true);
    }

    public void draw() {
        background(102);

        textFont(f);
        textAlign(CENTER);
        text(frameCount , 100, 100);

        pushMatrix();
        translate(width*0.2f, height*0.5f);
        rotate(frameCount / 200.0f);//１秒間に60/200だけ回転します。
        polygon(0, 0, 82, 3); //polygon関数を呼び出します。
        popMatrix();

        pushMatrix();
        translate(width*0.5f, height*0.5f);
        rotate(frameCount / 50.0f);
        polygon(0, 0, 80, 20);
        popMatrix();

        pushMatrix();
        translate(width*0.8f, height*0.5f);
        rotate(frameCount / -100.0f);
        polygon(0, 0, 70, 9);
        popMatrix();
    }

    public void polygon(float x, float y, float radius, int npoints) {
        float angle = TWO_PI / npoints; //npointsは図形の角数を示しています。radiusは半径です。
        //TWO_PIは２πという意味です。
        beginShape();
        for (float a = 0; a < TWO_PI; a += angle) { //１角分の角度だけ回転します。
            float sx = x + cos(a) * radius;
            float sy = y + sin(a) * radius;
            vertex(sx, sy);
        }
        endShape(CLOSE);//座標を線でつないで閉じます。
    }
}

