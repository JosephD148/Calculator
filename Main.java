import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println((scanner.nextLine().equals("four function")) ? fourFunction() : derivative());
        scanner.close();
    }
    public static double derivative(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("h: ");
        double h = scanner.nextDouble();
        System.out.println("Evaluate function at x: ");
        double x = scanner.nextDouble();
        double result = ((x+h)*(x+h)-4 - (x*x-4)) / h;//type the function you want to evaluate here, currently it is f(x) = x^2 - 4
        scanner.close();
        return result;

    }

    public static double fourFunction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.println("Enter operator");
        String operator = scanner.next();
        scanner.close();
        return calculate(a, b,operator);
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