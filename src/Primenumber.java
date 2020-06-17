import java.util.Scanner;

public class Primenumber
{
    public static void main(String[] args)     //main method
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");   //asking for user input
        int num = scanner.nextInt();   //storing user input in integer variable
        int temp = 0; int a =0;   //initialised integer variable
        for ( a=2;a<=num-1;a++)    //executing loop
        {
            if (num % a == 0)
            {
                temp = temp + 1;
            }
        }
        if (temp==0)   //checking if user enter value equal to addition value
        {
            System.out.println("Is prime number: " + num);
        }
        else
            {
                System.out.println("is not prime");
            }
    }
}
