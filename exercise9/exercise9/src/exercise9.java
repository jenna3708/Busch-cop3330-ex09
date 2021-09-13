import java.util.Scanner;


public class exercise9 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        String length = input.next();
        int convLength = Integer.parseInt(length);

        Scanner input2 = new Scanner (System.in);
        String width = input2.next();
        int convWidth = Integer.parseInt(width);

        double area = convLength * convWidth;
        double numGal = area / 350; //assuming one gallon covers 350 square feet


        System.out.println("You will need to purchase "+Math.ceil(numGal)+" gallons of paint to cover "+area+" square feet" );

    }
}

