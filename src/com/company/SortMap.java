package com.company;

import com.company.figures.Point;

import java.util.Comparator;

public class SortMap implements Comparator<Point>{

    @Override
    public int compare(Point o1, Point o2) {

        double mArea1 = o1.getArea();
        double mArea2 = o2.getArea();

        return Double.compare(mArea1, mArea2);
    }
}
