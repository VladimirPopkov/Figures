package com.company.figures;

public class Square extends Rectangle {

    private double mSide;

    public Square(double side, String name) {
        mSide = side;
        super.mName = name;
    }

    @Override
    public double getArea() {
        return Math.pow(mSide, 2);
    }

    @Override
    public double getPerimeter() {
        return mSide * 4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Square square = (Square) o;

        return Double.compare(square.mSide, mSide) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(mSide);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
