import java.util.Scanner;

public class First_last_sum
{
    public static void main(String[] args)    //main method
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number to find sum of first and last digit: ");  //asking for user input
        int num = scanner.nextInt();  //storing user input in integer variable

        int lastdigit = num % 10;  //to get last digit after every loop

        int firstdigit = num / 10000;    //remove last digit from number

        int sum = firstdigit+lastdigit;

        System.out.println("addition of firstdigit & lastdigit" + " = "  +sum);
    }

}

