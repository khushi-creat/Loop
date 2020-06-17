import java.util.Scanner;

public class Find_sum
{
    public static void main(String[] args)  //main method
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value");   //asking for user input
        int bal1 = scanner.nextInt();     //storing user input in integer variable
        int a;  int b =0;        //initialised integer variable
        while (bal1 >=1)      //execute loop
        {
            a = bal1%10;   //to get last digit after every loop
            b = a+b;
            bal1 = bal1/10;   //remove last digit from number
        }
        System.out.println(b);
    }
}
