package Practice_10;

import Practice_11.Rectangle;

public class ComparableRectangle extends Rectangle {

    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ComparableRectangle && getArea() == ((ComparableRectangle)obj).getArea();
    }
}
