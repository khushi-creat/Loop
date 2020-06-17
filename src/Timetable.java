import java.util.Scanner;

public class Timetable
{
    public static void main(String[] args)    //main method
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");  //asking for user input
        int num1 = scanner.nextInt();     //storing user input in integer variable
        System.out.println("Please enter second number");  //asking for user input
        int num2 = scanner.nextInt();   //storing user input in integer variable
        int value1=1;
        do
        {
            int a = num1 * value1;
            value1++;
            int value =1;
            do
            {
                int matrix = a * value;
                System.out.println(matrix + " ");
                value++;
            }
            while (value <= num2);
            System.out.println("");

        }
        while (value1 <= num2);
    }
}

