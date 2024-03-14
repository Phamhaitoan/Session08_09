package Ex09_01;

public class Circle implements Resizeable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }


    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void resize(double percent) {
        radius *= (1 + percent / 100);
    }
}
