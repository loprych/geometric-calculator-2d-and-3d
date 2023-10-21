import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean makeThreeDimensional = false;
        double a,b,c;
        Figure base = null;
        int choice = -1;
        while (true) {
            if (choice != 4){
                System.out.println("Enter 1 for triangle, 2 for rectangle, 3 for diamond, 4 for three-dimensional figure, 0 for quitting a program: ");
                makeThreeDimensional = false;
                choice = scanner.nextInt();
            }
            else {
                System.out.println("Enter 1 for triangle, 2 for rectangle, 3 for diamond, 0 for quitting a program: ");
                makeThreeDimensional = true;
                choice = scanner.nextInt();
            }
            switch (choice) {
                case 0:
                    System.out.println("Quitting a program");
                    return;
                case 1:
                    Triangle triangle;
                    while (true) {
                        try {
                            System.out.println("Enter sides of triangle: ");

                            a = scanner.nextDouble();
                            b = scanner.nextDouble();
                            c = scanner.nextDouble();
                            triangle = new Triangle(a, b, c);
                            break;
                        }
                        catch (IllegalArgumentException e) {
                            System.out.println("Invalid triangle, try again");
                            continue;
                        }
                    }
                        triangle.print();
                        base = triangle;
                    break;

                case 2:
                    Rectangle rectangle;
                    while (true){
                        try {
                            System.out.println("Enter sides of rectangle: ");
                            a = scanner.nextDouble();
                            b = scanner.nextDouble();
                            rectangle = new Rectangle(a, b);
                            break;
                        }
                        catch(IllegalArgumentException e)
                        {
                            System.out.println("Invalid rectangle, try again");
                            continue;
                        }
                    }
                        rectangle.print();
                        base = rectangle;
                    break;

                case 3:
                    Diamond diamond;
                    while (true){
                        try {
                        System.out.println("Enter sides of diamond: ");
                        a = scanner.nextDouble();
                        b = scanner.nextDouble();
                        System.out.println(("Enter angle of diamond: "));
                        double angle = scanner.nextDouble();
                        diamond = new Diamond(a, b, angle);
                        break;
                        }
                        catch(IllegalArgumentException e)
                        {
                            System.out.println("Invalid diamond, try again");
                            continue;
                        }
                    }
                    diamond.print();
                    base = diamond;
                    break;
                case 4:
                        System.out.println("Choose base of prism: ");
                        base = null;
                        break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            if (makeThreeDimensional == true) {
                ThreeDim threeDim;
                while (true) {
                    try {
                        System.out.println("Enter height of three-dimensional figure: ");
                        double height = scanner.nextDouble();
                        threeDim = new ThreeDim(base, height);
                        break;
                    }
                    catch (IllegalArgumentException e) {
                        System.out.println("Invalid three-dimensional figure, try again");
                        continue;
                    }
                }
                threeDim.print();
            }

        }
    }
}
