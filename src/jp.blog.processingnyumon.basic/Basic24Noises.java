package jp.blog.processingnyumon.basic;

import processing.core.PApplet;


public class Basic24Noises extends PApplet {

    final float DETAIL = 100; //  noise()の連続性の具合
    final int MAX_COLOR = 255;
    final int MAX_POWER = 20;  //  その空間の強さの最大（色と大きさにも使われる）
    int counter = 0;

    public void settings() {
        size(400, 400, "processing.opengl.PGraphics3D");
    }

    public void setup(){
        // 1D and 2D
//        size(400, 400);
        // 3D
//        size(400, 400, P3D);
        noStroke();
    }

    public void draw(){

        // noise 3D
        //  回転させるために、軸を中央に移動。
        translate(width / 2, height / 2, -width / 2);
        rotateY(radians(counter/ 2.0f));
        //  描画のために、基準点を元に戻す
        translate(-width / 2, -height / 2, width / 2);
        background(0);
        for(int z = 0; z > -width; z -= MAX_POWER){
            for(int y = 0; y < height; y += MAX_POWER){
                for(int x = 0; x < width; x += MAX_POWER){
                    pushMatrix();
                    translate(x, y, z);

                    float deep = noise(x / DETAIL, y / DETAIL, (z + counter * 5) / DETAIL) * MAX_POWER;
                    fill(255, deep * deep / 4);
                    box(deep * 2);
                    popMatrix();
                }
            }
        }
        counter++;


        // noise 2D
//        background(0);
//        loadPixels();
//        for(int y = 0; y < height; y++){
//            for(int x = 0; x < width; x++){
//                float whity = noise((x + counter) / DETAIL, (y + counter) / DETAIL) * MAX_COLOR;
//                pixels[y * width + x] = color(whity);
//            }
//        }
//        updatePixels();
//        counter++;

        // noise 1D
//        background(0);
//        stroke(255);
//        for(int x = 0; x < width; x++){
//            float y = noise((x + counter) / DETAIL) * height;
////            float y = random(height);
//            line(x, 0, x, y);
//        }
//        counter++;
    }
}

