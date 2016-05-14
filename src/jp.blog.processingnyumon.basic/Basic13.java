package jp.blog.processingnyumon.basic;

import processing.core.PApplet;
import processing.core.PGraphics;


public class Basic13 extends PApplet {

    PGraphics pg;

    public void setup() {
        size(640, 360);
        pg = createGraphics(400, 200);
    }

    public void draw() {
        fill(0, 12);//半透明の黒で塗りつぶす。
        rect(0, 0, width, height);//上記の色の■を画面いっぱいに描写して軌道を表現する。
        fill(255);
        noStroke();
        ellipse(mouseX, mouseY, 60, 60);

        pg.beginDraw();
//        pg.background(51);
//        pg.noFill();
        pg.noStroke();
        pg.fill(51, 12);
        pg.rect(0, 0, pg.width, pg.height);

//        pg.stroke(255);
        pg.fill(255);
        pg.ellipse(mouseX - 120, mouseY - 60, 60, 60);
//        pg.ellipse(mouseX, mouseY, 60, 60);
        pg.endDraw();

        image(pg, 120, 60);
    }
}

