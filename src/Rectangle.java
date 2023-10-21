    public class Rectangle extends Figure implements Printing {
        private double a;
        private double b;
    public Rectangle (double a, double b){
        if (a <= 0 || b <= 0){
            System.out.println("Invalid rectangle");
            throw new IllegalArgumentException("Invalid rectangle");
        }
        this.a = a;
        this.b = b;
    }
    public double calculateArea() {
        return a * b;
    }
    public double calculatePerimeter() {
        return 2 * (a + b);
    }
    public void print() {
        System.out.println("Rectangle with sides: " + a + ", " + b);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
