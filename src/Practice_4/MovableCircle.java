package Practice_4;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp(int y) {
        center.moveUp(y);
    }

    @Override
    public void moveDown(int y) {
        center.moveDown(y);
    }

    @Override
    public void moveLeft(int x) {
        center.moveLeft(x);
    }

    @Override
    public void moveRight(int x) {
        center.moveRight(x);
    }
}
