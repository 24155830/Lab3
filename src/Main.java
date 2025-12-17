import java.util.Scanner;
class Shape2D {
    double l, w;
    Shape2D(double l, double w) {
        this.l = l;
        this.w = w;
    }
    double cost() {
        return l * w * 40;
    }
}
class Shape3D extends Shape2D {
    double h;
    Shape3D(double l, double w, double h) {
        super(l, w);
        this.h = h;
    }
    double cost() {
        return l * w * h * 60;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 2D: ");
        Shape2D s2 = new Shape2D(sc.nextDouble(), sc.nextDouble());
        System.out.println("2D Cost: " + s2.cost());

        System.out.print("Enter 3D: ");
        Shape3D s3 = new Shape3D(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("3D Cost: " + s3.cost());
    }
}