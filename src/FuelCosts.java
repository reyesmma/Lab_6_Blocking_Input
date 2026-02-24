import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double mpg = 0.0;
        double costPerGallon = 0.0;
        double tankSize = 0.0;
        boolean done = false;
        String trash = "";
        double totalCost = 0.0;
        double totalDistance = 0.0;

        do {
            System.out.print("Enter the miles per gallon: ");
            if (in.hasNextDouble())
            {
                mpg = in.nextDouble();
                in.nextLine();
                if (mpg >=0)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Invalid value entered.");
                }
            } else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + "\n" + "Enter a valid number.");
            }
        }
        while(!done);

        done = false;

        do
        {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble())
            {
                tankSize = in.nextDouble();
                in.nextLine();
                if (tankSize >=0)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Invalid value entered.");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + "\n" + "Enter a valid number.");
            }
        }
        while(!done);

        done = false;

        do
        {
            System.out.print("Enter the price of gas per gallon: ");
            if(in.hasNextDouble())
            {
                costPerGallon = in.nextDouble();
                in.nextLine();
                if (costPerGallon >=0)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Invalid value entered.");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + "\n" + "Enter a valid number.");
            }
        }
        while(!done);

        totalCost = 100.0 / mpg * costPerGallon;
        System.out.println("The cost to drive 100 miles is $" + totalCost + ".");

        totalDistance = tankSize * mpg;
        System.out.println("The car can go " + totalDistance +  " miles with a full tank of gas.");
    }
}
