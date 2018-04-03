package com.company.figures;

public class Rectangle extends Point {

    private double mSideA;
    private double mSideB;

    public Rectangle(double sideA, double sideB, String name) {
        mSideA = sideA;
        mSideB = sideB;
        super.mName = name;
    }

    public Rectangle() {
    }

    @Override
    public double getArea() {
        return mSideA * mSideB;
    }

    @Override
    public double getPerimeter() {
        return (mSideA * 2) + (mSideB * 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.mSideA, mSideA) != 0) return false;
        return Double.compare(rectangle.mSideB, mSideB) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(mSideA);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(mSideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
