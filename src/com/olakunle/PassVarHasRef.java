package com.olakunle;

import java.awt.*;

public class PassVarHasRef {
//    02
//    primitive
public static void main(String[] args) {
    int x = 0;
    int y = incrementValues(x);
    System.out.println(x);
    System.out.println(y);
}

    static int incrementValues(int value) {
        value ++;
        return  value;
    }
//    Reference
    public static void main1(String[] args) {

        Point point = new Point(100,200);
        changePoint(point);
        System.out.println(point);
    }

    static void changePoint(Point point) {
        point.x = 0;
        point.y = 0;
    }


}
