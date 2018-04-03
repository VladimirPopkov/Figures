package com.company.figures;

public class Triangle extends Point {

    private double mSideA;
    private double mSideB;
    private double mAngleAB;

    public Triangle(double sideA, double sideB, double angleAB, String name) {
        mSideA = sideA;
        mSideB = sideB;
        mAngleAB = angleAB;
        super.mName = name;
    }

    @Override
    public double getArea() {
        return (mSideA * mSideB * Math.sin(mAngleAB * Math.PI / 180)) / 2;
    }

    @Override
    public double getPerimeter() {
        return mSideA + mSideB + calculationSideC();
    }

    private double calculationSideC() {
        return Math.sqrt(Math.pow(mSideA, 2) + Math.pow(mSideB, 2)
                - 2 * mSideA * mSideB * Math.cos(mAngleAB * Math.PI / 180));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.mSideA, mSideA) != 0) return false;
        if (Double.compare(triangle.mSideB, mSideB) != 0) return false;
        return Double.compare(triangle.mAngleAB, mAngleAB) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(mSideA);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(mSideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(mAngleAB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
