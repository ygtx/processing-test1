package jp.blog.processingnyumon.basic;

import processing.core.PApplet;




enum SortedParameters {
    I1(2, 1),
    I2(2, 2),
    I3(1, 2),
    I4(2, 3),
    I5(2, 1),
    I6(2, 2),
    I7(2, 2),
    I8(1, 3),
    I9(1, 3),
    ;

    public final int timeLength;
    public final int velocity;

    SortedParameters(int timeLength, int velocity){
        this.timeLength = timeLength;
        this.velocity = velocity;
    }


}


public class Basic15Dassen extends PApplet {

    int UNIT;
    public void setup() {
        size(640, 360);
        background(255);
        noLoop();

        UNIT = width / SortedParameters.values().length + 1;
    }

    public void draw() {

        SortedParameters params = SortedParameters.I1;
        stroke(122);

        int previousIndex = 0;
        for (int i = 0; i < width; i++) {

            int paramIndex = floor(i / UNIT);
            if (paramIndex != previousIndex) {
                previousIndex = paramIndex;
                params = SortedParameters.valueOf("I" + String.valueOf(paramIndex + 1));
            }

            float maxHeight = height / 3 * params.velocity;
            float minHeight = maxHeight / 2;

            line(i, height, i, height - random(minHeight, maxHeight));

        }
    }
}

