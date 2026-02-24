import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double length = 0.0;
        boolean done = false;
        String trash = "";
        double area = 0.0;
        double perimeter = 0.0;
        double diagonal = 0.0;

        do
        {
            System.out.print("Enter the width of the rectangle in feet: ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                if (width >=0)
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
            System.out.print("Enter the length of the rectangle in feet: ");
            if (in.hasNextDouble())
            {
                length = in.nextDouble();
                in.nextLine();
                if (length >=0)
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

        area = width * length;
        System.out.println("The area of the rectangle is " + area + " square feet.");

        perimeter = 2* width + 2 * length;
        System.out.println("The perimeter of the rectangle is " + perimeter +  " feet.");

        diagonal = Math.sqrt(width * width + length * length);
        System.out.println("The length of the diagonal is " + diagonal +  " feet.");
    }

}