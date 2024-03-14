package Ex08_03;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(4,6);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(10,12);
        System.out.println("trước khi di chuyển");
        System.out.println(movablePoint);
        System.out.println("sau khi di chuyển");
        movablePoint.move();
        System.out.println(movablePoint);

    }
}
