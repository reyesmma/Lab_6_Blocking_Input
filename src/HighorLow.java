import java.util.Scanner;
import java.util.Random;

public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int val = generator.nextInt(10) + 1;
        int guess = 0;
        boolean done = false;
        String trash;

        do
        {
            System.out.print("Enter the your guess [1-10]: ");
            if (in.hasNextInt())
            {
                guess = in.nextInt();
                in.nextLine();
                if (guess >=0 && guess <=10)
                {
                    if (guess < val)
                    {
                        System.out.println("Your guess of " + guess + " is low!");
                    }
                    else if (guess > val)
                    {
                        System.out.println("Your guess of " + guess + " is high!");
                    }
                    else
                    {
                        System.out.println("Your guess of " + guess + " is correct!");
                        done = true;
                    }
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
    }

}