import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args)   //main method
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any five digit number");   //asking for user input
        int num = scanner.nextInt();
        int rem = 0;  int reserved =0;   //initialised integer variable

        while (num !=0)   //execute loop
        {
            rem = num % 10;
            reserved = reserved *10 + rem;
            num = num /10;
        }
        System.out.println("Reversed number: " + reserved);
    }
}
