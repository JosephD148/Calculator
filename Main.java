import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double b = scanner.nextDouble();
        scanner.close();
        System.out.println(add(a, b));
    }

    public static double add(double a, double b) {
        return a + b;
    }
}