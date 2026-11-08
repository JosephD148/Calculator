import java.util.ArrayList;
import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>();
       // list = getList();
        Calc calculator =  new Calc(1,2);
        System.out.println(calculator.numOne);

    }

    public static ArrayList<Double> getList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        for(int i=0; i<3; i++){
            System.out.println("Enter a number: ");
            list.add(scanner.nextDouble());
        }
        scanner.close();
        return list;
    }
}