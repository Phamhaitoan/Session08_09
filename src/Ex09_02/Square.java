package Ex09_02;

public class Square extends Shape implements Colorable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    public Square(String color, boolean filled) {
        super(color, filled);
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public void howToColor() {
        super.howToColor();
    }
}
