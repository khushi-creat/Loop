import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Odd_even
{
    public static void main(String[] args)     //main method
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value");    //asking for user input
        int num1 = scanner.nextInt();      //storing user input in integer variable
        int odd=0;  int even =0;  int sumeven = 0;  int sumodd =0; int  result =0;   //initialised integer variable
        if (num1 >= 10000 && num1 < 100000)
            while (num1 > 0) {       //execute loop
                result = num1 % 10;   //to get last digit after every loop
                if (num1 % 2 == 0) {
                    sumeven = sumeven + result;
                    even++;
                } else {
                    sumodd = sumodd + result;
                }
                num1 = num1 / 10;
                System.out.println("sum of odd number are: " + odd);
                System.out.println("number of odd are: " + even);
                System.out.println("sum of even are: " + sumeven);
                System.out.println("number of even are: " + sumodd);
            }   else
                    {
                        System.out.println("please enter five digit only");
                    }



    }
}
