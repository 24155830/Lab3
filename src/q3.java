import java.util.Scanner;
class Account {
    int acc;
    double bal;
    void input(Scanner sc) {
        System.out.print("Enter Acc No: ");
        acc = sc.nextInt();
        System.out.print("Enter Balance: ");
        bal = sc.nextDouble();
    }
    void disp() {
        System.out.println("Acc No: " + acc + " | Balance: " + bal);
    }
}class Person extends Account {
    String name;
    long adh;
    void input(Scanner sc) {
        super.input(sc);
        System.out.print("Enter Name: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Enter Aadhar: ");
        adh = sc.nextLong();
    }
    void disp() {
        System.out.print("Name: " + name + "  Aadhar: " + adh + "  ");
        super.disp();
    }
}
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] p = new Person[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            p[i] = new Person();
            p[i].input(sc);
        } System.out.println("\nResults");
        for (int i = 0; i < 3; i++) {
            p[i].disp();
        }
    }
}