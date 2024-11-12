package Practice_4;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;


    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp(int y) {
        this.y = this.y + y;
    }

    @Override
    public void moveDown(int y) {
        this.y = this.y - y;
    }

    @Override
    public void moveLeft(int x) {
        this.x = this.x - x;
    }

    @Override
    public void moveRight(int x) {
        this.x = this.x + x;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
