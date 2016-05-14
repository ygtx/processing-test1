package jp.blog.processingnyumon.basic;

import processing.core.PApplet;


public class Basic18 extends PApplet {

    Eye e1, e2, e3;//Eyeクラスの変数を宣言しています。

    public void setup() {
        size(640, 360);
        noStroke();
        e1 = new Eye( 250,  16, 120);//Eyeクラスに数値を入力しています。
        e2 = new Eye( 164, 185,  80);
        e3 = new Eye( 420, 230, 220);
    }

    public void draw() {
        background(102);

        e1.update(mouseX, mouseY);//Eyleクラスのupdateを引き出しています。値にはmouseX,mouseYを入れています。
        e2.update(mouseX, mouseY);
        e3.update(mouseX, mouseY);

        e1.display();
        e2.display();
        e3.display();
    }

    class Eye {
        int x, y;
        int size;
        float angle = 0.0f;

        Eye(int tx, int ty, int ts) {//コンストラクタです。
            x = tx;
            y = ty;
            size = ts;
        }

        void update(int mx, int my) {//mxにはmouseX、myにはmouseYが入ります。
            angle = atan2(my - y, mx - x);//atan2は角度を求める関数です。x,yとの角度を求めています・
        }

        void display() {
            pushMatrix();//座標を記録します。
            translate(x, y);//円の中心に座標を合わせます・
            fill(255);
            ellipse(0, 0, size, size);//目の外側の円を描きます。
            rotate(angle);//マウスの角度分だけ回します。
            fill(153, 204, 0);
            ellipse(size / 4, 0, size / 2, size / 2);//目の玉を描きます。
            popMatrix();//座標を元に戻します。
        }
    }
}

