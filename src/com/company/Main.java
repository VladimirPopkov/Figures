package com.company;

import com.company.figures.*;

import java.text.DecimalFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Point, Double> figures = new HashMap<>();
        TreeMap<Point, Double> sortedMap = new TreeMap(new SortMap());

        for (int i = 0; i < 10; i++) {
            Circle circle = new Circle(1 + Math.random() * 50, "Круг №" + (i + 1));
            Rectangle rectangle = new Rectangle(1 + Math.random()
                    * 50, 1 + Math.random() * 50, "Прямоугольник №" + (i + 1));
            Square square = new Square(1 + Math.random() * 50, "Квадрат №" + (i + 1));
            Triangle triangle = new Triangle(1 + Math.random() * 50,
                    1 + Math.random() * 50, 1 + Math.random() * 50, "Треугольник №" + (i + 1));
            figures.put(circle, circle.getArea());
            figures.put(rectangle, rectangle.getArea());
            figures.put(square, square.getArea());
            figures.put(triangle, triangle.getArea());
        }

        sortedMap.putAll(figures);

        for (Point key : sortedMap.keySet()) {
            System.out.println(key + " = " + new DecimalFormat("#0.00").format(sortedMap.get(key)));
        }
    }
}
