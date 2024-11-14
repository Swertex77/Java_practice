package Practice_11;

import Practice_10.Comparable;
import Practice_10.GeometricObject;

public class Rectangle extends GeometricObject implements Comparable<GeometricObject> {
    private double width;
    private double height;


    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }


    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }


    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            return Double.compare(this.getArea(), other.getArea()) == 0;
        }
        return false;
    }

    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}