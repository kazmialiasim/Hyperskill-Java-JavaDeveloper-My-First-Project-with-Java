package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bubblegum = 200 + 2;
        float toffee = 117.8f + 0.2f;
        double iceCream = 2245 + 5;
        double milkyChocloate = 1676 + 4;
        float doughnut = 1072.5f + 2.5f;
        double pancake = 76.8 + 3.2;
        float earnedAmount = (float) (bubblegum + toffee + iceCream + milkyChocloate + doughnut +pancake);

        System.out.println("Earned amount:");
        System.out.println("Bubblegum: " +"$" +bubblegum);
        System.out.println("Toffee: " +"$" + toffee);
        System.out.println("Ice cream:" +"$" +iceCream);
        System.out.println("Milk chocolate: " +"$" + milkyChocloate);
        System.out.println("Doughnut: "+"$" +doughnut);
        System.out.println("Pancake: "+"$" +pancake);
        System.out.println(" ");
        System.out.println("Income: $" +earnedAmount);
        System.out.println("Staff expenses: " );
        double staffExpenses = scanner.nextDouble();
        System.out.println("Other expenses: " );
        double otherExpenses = scanner.nextDouble();

        double netIncome = earnedAmount - staffExpenses - otherExpenses;
        System.out.println("Net income: "+"$"+ netIncome);


    }
}