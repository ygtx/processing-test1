package jp.blog.processingnyumon.basic;

import processing.core.PApplet;


public class Basic12 extends PApplet {

    public void setup() {
        size(640, 560);
        noStroke();
        noLoop();//loopは禁止しています。
    }

    public void draw() {
        drawCircle(width/2, 280, 10);
    }

    private void drawCircle(int x, int radius, int level) {
        float tt = (float) (126 * level/4.0);
        fill(tt);
        ellipse(x, height/2, radius*2, radius*2);
        if(level > 1) {
            level = level - 1;
            drawCircle(x - radius/2, radius/2, level);//ここでvoid drawCircleに戻る。
            //levelが１になるまで次のステップにはいきません。
            drawCircle(x + radius/2, radius/2, level);
            //↑これが作動し始めるのは、levelが１になったときです。
        }
    }
}

