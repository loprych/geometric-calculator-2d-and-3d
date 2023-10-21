public class ThreeDim implements Printing {
    private Figure base;
    private double height;
    public ThreeDim (Figure base, double height) {
        if (height <= 0) {
            System.out.println("Invalid three dimensional figure");
            throw new IllegalArgumentException("Invalid three dimensional figure");
        }
        this.base = base;
        this.height = height;
    }
    public double calculateVolume() {
        return base.calculateArea() * height;
    }
    public double calculateSurfaceArea() {
        return 2 * base.calculateArea() + base.calculatePerimeter() * height;
    }
    public void print () {
        System.out.println("Three dimensional figure with base: ");
        System.out.println("Base area: " + base.calculateArea());
        System.out.println("Base perimeter: " + base.calculatePerimeter());
        System.out.println("Height: " + height);
        System.out.println("Volume: " + calculateVolume());
        System.out.println("Surface area: " + calculateSurfaceArea());
    }
}
