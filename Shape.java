import java.util.*;

class Shape {
    double a, volume, volume1, h, r,h1,r1;

    void area(double radius) {
        r = radius;
        double a = 3.14 * r * r;
        System.out.println("Area of circle: " + a);
    }

    void area(double radius, double height) {
        r = radius;
        h = height;
        double volume = 3.14 * r * r * h;
        System.out.println("Volume of cylinder: " + volume);
    }

    void area(double rad, double hei) {
        r1 = rad;
        h1 = hei;
        double volume1 = (1.0 / 3.0) * 3.14 * (r * r) * h;
        System.out.println("Volume of cone: " + volume1);
    }

    public static void main(String[] args) {
        Shape s = new Shape();
        s.area(10);
        s.area(10, 5);
        s.area(10, 5); // Indicate it's a cone
    }
}
