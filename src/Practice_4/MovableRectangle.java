package Practice_4;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed ) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private boolean hasSameSpeed() {
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }

    @Override
    public void moveUp(int y) {
        if(hasSameSpeed()) {
            topLeft.moveUp(y);
            bottomRight.moveRight(bottomRight.x);        }
    }

    @Override
    public void moveDown(int y) {
        if(hasSameSpeed()) {
            topLeft.moveDown(y);
        }
    }

    @Override
    public void moveLeft(int x) {
        if(hasSameSpeed()) {
            bottomRight.moveLeft(x);
        }
    }

    @Override
    public void moveRight(int x) {
        if(hasSameSpeed()) {
            bottomRight.moveRight(x);
        }
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
