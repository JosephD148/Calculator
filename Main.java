import java.util.Scanner;
public final class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        scanner.close();
        System.out.println(add(a, b));
    }
    public static double add(double a, double b){
        return a + b;
    }
}