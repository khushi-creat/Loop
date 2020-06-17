import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value to check palindrome numbers or not: ");   //asking for user input
        int num = scanner.nextInt();      //storing user input in integer variable
        System.out.println();
        int a = num; int b; int rev = 0;    //initialised integer variable
        while (a != 0)     //execute loop
        {
          b = a %10;     //to get last digit after every loop
          rev = rev*10 + b;
          a = a /10;     //remove last digit from number
        }
        if (num == rev)   //checking if user enter value queal to addition value
        {
            System.out.println("Number is palindrome number: " + a);
        }
        else
        {
            System.out.println("Number is not palindrome number" + a);
        }
    }
}
