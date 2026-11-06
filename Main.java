import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.println("Enter operator");
        String operator = scanner.next();
        scanner.close();
        System.out.println(calculate(a, b,operator));
    }

    public static double calculate (double a, double b, String operator){
        switch (operator){
            case "+": return add(a,b);
            case "-": return subtract(a,b);
            default: throw new IllegalArgumentException("Invalid operator");
        }
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
}