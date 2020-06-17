import java.util.Scanner;

public class Armstrong
{
    public static void main(String[] args)  //main method
    {
       int num = 0; int number = 0; int temp = 0; int total = 0;    //initialised integer variable
        System.out.println("Enter any number");      //asking for user input
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();   //storing user input in integer variable
        number = num;
        for (; number !=0; number /=10)   //executing loop for covnting number of digit
        {
            temp = number % 10;    //to get last digit after every loop
            total = total + temp * temp * temp;
        }
        if (total == num)   //checking if user enter value equal to addition value
            System.out.println(num + " Is an armstrong number ");
        else
            System.out.println(" Is not armstrong number ");
    }
}
