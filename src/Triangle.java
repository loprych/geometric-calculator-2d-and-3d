import java.util.Scanner;
public class Triangle extends Figure implements Printing  {
        private double a;
        private double b;
        private double c;

    public Triangle (double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a || a <= 0 || b <= 0 || c <= 0){
            System.out.println("Invalid triangle");
            throw new IllegalArgumentException("Invalid triangle");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double calculateArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }
    public double calculatePerimeter() {
        return a + b + c;
    }
    public void print() {
        System.out.println("Triangle with sides: " + a + ", " + b + ", " + c);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }


}
