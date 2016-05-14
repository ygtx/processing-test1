package jp.blog.processingnyumon.basic;

import processing.core.PApplet;


public class Basic15 extends PApplet {

    float[] coswave; //配列の型と配列名の宣言

    public void setup() {
        size(640, 360);
        coswave = new float[width];//配列の個数の宣言
        for (int i = 0; i < width; i++) {
            float amount = map(i, 0, width, 0, PI);//mapはiを0~widthに変換して、0~PIの間に直す。
            coswave[i] = abs(cos(amount));//ここでcosにすることで0~1の間に変換できる。
        }
        background(255);
        noLoop();
    }

    public void draw() {

        int y1 = 0;
        int y2 = height;
        for (int i = 0; i < width; i += 2) {
            stroke(coswave[i] * 255);//0~1の値を255に掛けている。
            line(i, y1, i, y2);
        }
    }
}

