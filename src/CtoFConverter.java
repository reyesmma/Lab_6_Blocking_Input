import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        double degC = 0.0;
        double degF;
        Scanner in = new Scanner(System.in);
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print("Enter temperature in degrees Celsius: ");
            if(in.hasNextDouble())
            {
                degC = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + "\n" + "Enter a valid number.");

            }
        }
        while(!done);

        degF = (degC * 9/5) + 32;
        System.out.println(degC + " degrees Celsius is " + degF + " degrees Fahrenheit.");
    }

}