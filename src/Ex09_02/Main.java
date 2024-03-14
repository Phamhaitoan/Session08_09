package Ex09_02;

public class Main {
     public static void main(String[] args) {

          Shape shape = new Shape();
          System.out.println(shape);

          shape = new Shape("red", false);
          System.out.println(shape);



         Circle circle = new Circle(3.5, "red", false);
          System.out.println(circle);


         Rectangle rectangle = new Rectangle(2.5, 3.5);
          System.out.println(rectangle);

          Square square = new Square("red",false,4.5);
          System.out.println(square);

         Colorable[] shapes = {circle,rectangle,square};
          for (Colorable shape1 : shapes) {
               shape1.howToColor();
          }
     }

}
