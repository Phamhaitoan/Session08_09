package Ex08_01;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7,"blue");
        circle.getArea();

        Cylinder cylinder = new Cylinder(5,"red",9);
        cylinder.cylindricalVolume();
        System.out.println("diện tích hình tròn là:" + circle.getArea());
        System.out.println("thể tích hình trụ là:" + cylinder.cylindricalVolume());
    }
}
