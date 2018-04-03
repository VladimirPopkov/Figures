package com.company.figures;

import com.company.Calculated;

public class Point implements Calculated {

    String mName;

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return mName + ": Площадь " /*+ new BigDecimal(getArea()).setScale(2, RoundingMode.UP).doubleValue()*/;
    }

}
