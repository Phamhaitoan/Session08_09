package Ex08_05;

public class StaticMethod {
    private static final double Pi = 3.14;
    private static double r;
    private static double width,height;
    private static double a,b,c;

    public StaticMethod() {
    }


    public static double getR() {
        return r;
    }

    public static void setR(double r) {
        StaticMethod.r = r;
    }

    public static double getWidth() {
        return width;
    }

    public static void setWidth(double width) {
        StaticMethod.width = width;
    }

    public static double getHeight() {
        return height;
    }

    public static void setHeight(double height) {
        StaticMethod.height = height;
    }

    public static double getA() {
        return a;
    }

    public static void setA(double a) {
        StaticMethod.a = a;
    }

    public static double getB() {
        return b;
    }

    public static void setB(double b) {
        StaticMethod.b = b;
    }

    public static double getC() {
        return c;
    }

    public static void setC(double c) {
        StaticMethod.c = c;
    }

    public static double calCircleArea(double r){
              return Pi*r*r;
    }
    public static double calRectangleArea(double width,double height){
        return width * height;
    }
    public static double calTriangleArea(double a, double b, double c){
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

}
