package Ex08_05;

public class Main {
    public static void main(String[] args) {

        double circleArea1 = StaticMethod.calCircleArea(3.5);
        double circleArea2 = StaticMethod.calCircleArea(6);
        System.out.println("Diện tích của hình tròn có bán kính 3.5: " + circleArea1);
        System.out.println("Diện tích của hình tròn có bán kính 6: " + circleArea2);


        double triangleArea1 = StaticMethod.calTriangleArea(3, 4, 5);
        double triangleArea2 = StaticMethod.calTriangleArea(4.5, 7, 6);
        System.out.println("Diện tích của hình tam giác có cạnh (3, 4, 5): " + triangleArea1);
        System.out.println("Diện tích của hình tam giác có cạnh (4.5, 7, 6): " + triangleArea2);


        double rectangleArea1 = StaticMethod.calRectangleArea(2.5, 6);
        double rectangleArea2 = StaticMethod.calRectangleArea(4, 7);
        System.out.println("Diện tích của hình chữ nhật có kích thước (2.5, 6): " + rectangleArea1);
        System.out.println("Diện tích của hình chữ nhật có kích thước (4, 7): " + rectangleArea2);
    }
}
