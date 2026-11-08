import java.util.Scanner;
import java.util.ArrayList;

public class Calc {

    double numOne;
    double numTwo;
    ArrayList<Double> list = new ArrayList<>();

    public Calc(double x, double y) {
        numOne = x;
        numTwo = y;
    }

    public Calc(ArrayList<Double> input) {
        list = input;
    }

    public double add() {
        return numOne + numTwo;
    }

    public double avg() {
        double total = sum(list);
        double avg = total / list.size();
        return avg;
    }

    public double stdev() {
        double average = avg();
        double variance = 0;
        for (int i = 0; i<list.size() ; i++){
            variance += (list.get(i) - average)*(list.get(i) - average);
        }
        return Math.sqrt(variance / list.size());
    }

    public double sum(ArrayList<Double> list) {
        double sum = 0;
        for (double x : list) {
            sum += x;
        }
        return sum;
    }

    public double derivative(double x) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("h: ");
        double h = scanner.nextDouble();
        System.out.println("Evaluate function at x: ");
        double result = ((x + h) * (x + h) - 4 - (x * x - 4)) / h;// type the function you want to evaluate here, currently it is f(x) = x^2 - 4
        scanner.close();
        return result;

    }
}