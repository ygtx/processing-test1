package jp.blog.processingnyumon.basic;

import processing.core.*;


public class Basic8 extends PApplet {

    class Ball {
        public float x;
        public float y;
        public float r;
        public int color;
        public Ball(float x, float y, float r, int color) {
            this.x = x;
            this.y = y;
            this.r = r;
            this.color = color;
        }
        public void render(float x, float y, float r, int color) {
            fill(color);
            ellipse(x, y, r, r);
        }
    }

    class InnerBox {
        public int color;
        public float x1, y1, x2, y2;
        public InnerBox(float x1, float y1, float x2, float y2, int color) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.color = color;
        }
        public void render() {
            fill(this.color);
            rect(this.x1, this.y1, this.x2, this.y2);
        }
    }

    InnerBox innerBox;
    int edge = 50;

    Ball ball;
    int ballRadius = 24;
    float easing = 0.05f;
    float inner = ballRadius + edge;

    int baseWidth = 300;
    int baseHeight = 300;

    public void setup() {
        size(baseWidth, baseHeight);
        noStroke();

        ellipseMode(RADIUS);
        ball = new Ball(baseWidth / 2, baseHeight / 2, ballRadius, 76);

        rectMode(CORNERS);
        innerBox = new InnerBox(edge, edge, baseWidth - edge, baseHeight - edge, 255);
    }

    private float getNextPosition(float currentPosition, float currentMouse) {
        return currentPosition + (currentMouse - currentPosition) * easing;
    }

    public void draw() {
        background(200,200,100);
        if (abs(mouseX - ball.x) > 0.1) {
            ball.x = constrain(this.getNextPosition(ball.x, mouseX), inner, width - inner);
        }
        if (abs(mouseY - ball.y) > 0.1) {
            ball.y = constrain(this.getNextPosition(ball.y, mouseY), inner, height - inner);
        }
        innerBox.render();
        ball.render(ball.x, ball.y, ballRadius, ballRadius);

    }


//    float mx; //まるのｘ座標
//    float my; //まるのy座標
//    float easing = 0.05f;//追いつく速度
//    int radius = 24;//丸の半径
//    int edge = 50;//■の外の距離
//    int inner = edge + radius;//実際の■の外の距離（円の座標は中心にあるのでこうしないと
//
//    public void setup() {
//        size(300, 300);
//        noStroke();
//        ellipseMode(RADIUS);//円の値は半径となる。
//        rectMode(CORNERS); //  rect(左上頂点のx座標, 左上頂点のy座標, 右下頂点のx座標, 右下頂点のy座標)
//    }
//
//    public void draw() {
//        background(200,200,100);
//
//        if (abs(mouseX - mx) > 0.1) {//もしマウスとまるのｘ座標の差が0.1よりも大きい時
//            mx = mx + (mouseX - mx) * easing;//差に0.05掛けた数値を足していく。
//        }
//        if (abs(mouseY - my) > 0.1) {//もしマウスとまるのy座標の差が0.1よりも大きい時
//            my = my + (mouseY- my) * easing;//もしマウスとまるのｘ座標の差が0.1よりも大きい時
//        }
//
//        mx = constrain(mx, inner, width - inner);
//        //constrainはmxの値をinnerとwidth-innerの間にする。
//
//        my = constrain(my, inner, height - inner);
//        //constrainはmyの値をinnerとheight-innerの間にする。
//
//        fill(76);
//        rect(edge, edge, width-edge, height-edge);
//        //壁から１００離れている■を描く。
//
//        fill(255);
//        ellipse(mx, my, radius, radius);
//        //移動距離がmx,myによって制限されている。
//    }
}

