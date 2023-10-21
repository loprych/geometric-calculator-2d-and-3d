    public class Diamond extends Figure implements Printing {
        private double a;
        private double b;
        private double angle;


    public Diamond (double a, double b, double angle) {
        if (a <= 0 || b <= 0 || angle <= 0 || angle >= 180) {
            System.out.println("Invalid diamond");
            throw new IllegalArgumentException("Invalid diamond");
        }
        this.a = a;
        this.b = b;
        this.angle = angle;
    }
    public double calculateArea() {
        return a * b * Math.sin(Math.toRadians(angle));
    }
    public double calculatePerimeter() {
        return 2 * (a + b);
    }
    public void print() {
        System.out.println("Diamond with sides: " + a + ", " + b + " and angle: " + angle);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

