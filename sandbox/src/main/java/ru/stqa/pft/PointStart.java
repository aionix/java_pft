package ru.stqa.pft;

import ru.stqa.pft.Point;

/**
 * Created by Артем on 09.01.2017.
 */
public class PointStart {
    public static void main(String[] args){
        Point p1 = new Point(1.0, 5.0);
        Point p2 = new Point(1.0, 1.0);
        Point n = new Point();



        System.out.println(Point.distance(p1, p2));


    }
}
