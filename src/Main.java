import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double gas_tank = 0;
        double fuel_efficiency = 0;
        double gas_price;
        double cost_100_miles;
        double max_distance;
        boolean trash;

        System.out.print("How many gallons of gas is in your tank?: ");

        if (input.hasNextDouble())
        {
            gas_tank = input.nextDouble();
        }
        else
        {
            trash = input.hasNextDouble();
            System.out.println("You must enter a valid integer!");
            System.out.println("Run the code again!");
            System.exit(0);
        }

        System.out.print("How many miles per gallon does your car get?: ");

        if (input.hasNextDouble())
        {
            fuel_efficiency = input.nextDouble();
        }
        else
        {
            trash = input.hasNextDouble();
            System.out.println("You must enter a valid integer!");
            System.out.println("Run the code again!");
            System.exit(0);
        }

        System.out.print("What is the price per gallon?: ");

        if (input.hasNextDouble())
        {
            gas_price = input.nextDouble();
            cost_100_miles = (100 / fuel_efficiency) * gas_price;
            System.out.printf("Cost per 100 miles: %.2f\n", cost_100_miles);
            max_distance = fuel_efficiency * gas_tank;
            System.out.println("Maximum distance: " + max_distance);
        }
        else
        {
            trash = input.hasNextDouble();
            System.out.println("You must enter a valid integer!");
            System.out.println("Run the code again!");
            System.exit(0);
        }
    }
    private static class string {
    }
}