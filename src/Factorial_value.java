import java.util.Scanner;

public class Factorial_value
{
    public static void main(String[] args)    //main method
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");   //asking for user input
        int num = scanner.nextInt();      //storing user input in integer variable
         int a; int tap =1;
         for (a = num;a >= 1; a--)  //executing loop for coventing number of digit
         {
             tap = tap * a;
         }
        System.out.println("factorial of "+num+" is " + tap);
    }
}
