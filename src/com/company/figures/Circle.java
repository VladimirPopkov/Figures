package com.company.figures;

public class Circle extends Point {

    private double mR;

    public Circle(double R, String name) {
        mR = R;
        super.mName = name;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(mR, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * mR;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.mR, mR) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(mR);
        return (int) (temp ^ (temp >>> 32));
    }
}
