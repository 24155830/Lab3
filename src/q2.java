import java.util.Scanner;
class Plate {
    double l, w;
    Plate(double l, double w) {
        this.l = l;
        this.w = w;
        System.out.println("Plate: " + l + "x" + w);
    }
}
class Box extends Plate {
    double h;
    Box(double l, double w, double h) {
        super(l, w);
        this.h = h;
        System.out.println("Box: " + l + "x" + w + "x" + h);
    }
}
class WoodBox extends Box {
    double t;
    WoodBox(double l, double w, double h, double t) {
        super(l, w, h);
        this.t = t;
        System.out.println("WoodBox: " + l + "x" + w + "x" + h + " with thickness " + t);
    }
}
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter L, W, H, T: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double t = sc.nextDouble();
        WoodBox wb = new WoodBox(l, w, h, t);
    }
}