import java.util.Scanner;

public class Positive_integer
{
    public static void main(String[] args)      //main method
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");    //asking for user input
        int num = scanner.nextInt();     //storing user input in integer variable
        int a=0;
        for (a=1;a<=10;a++)   //executing loop
        {
            System.out.println(num + "" + "*" + a + "=" +num*a);
        }
    }
}
