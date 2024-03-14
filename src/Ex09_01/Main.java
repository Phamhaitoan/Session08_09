package Ex09_01;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 3);
        shapes[2] = new Square(2);

        Random random = new Random();

        for (Resizeable shape : shapes) {
            double percent = random.nextInt(100) + 1;
            double oldArea = shape.getArea();
            shape.resize(percent);
            double newArea = shape.getArea();
            System.out.println("Before resizing by " + percent + "%: " + oldArea);
            System.out.println("After resizing by " + percent + "%: " + newArea);
        }
    }
}