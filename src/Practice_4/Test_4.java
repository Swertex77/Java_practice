package Practice_4;

public class Test_4 {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(20, 40, 5000, 4000);

        movablePoint.moveRight(2);
        movablePoint.moveLeft(20);
        movablePoint.moveUp(43);
        movablePoint.moveDown(11);
    }
}
