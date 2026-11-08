import java.util.ArrayList;
import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {

        ArrayList<Double> list;
        list = getList();
        Calc calculator =  new Calc(list);
        System.out.println(calculator.avg());

    }

    public static ArrayList<Double> getList() {
        ArrayList<Double> list;
        try (Scanner scanner = new Scanner(System.in)) {
            list = new ArrayList<>();
            double x;
            do {
                System.out.println("Enter a number: ");
                x = scanner.nextDouble();
                list.add(x);
            } while(x != 0);
        }
        return list;
    }
}