// we go to min 1 Stairs and max 2 Stairs at a time

import java.util.Scanner;

public class Count_Ways_for_go_up_From_Stairs {

    //function defining
    public static int countNum(int n)
    {
        int result = 0;
        if(n<=1)
        {
            return n;
        }
        else
        {
            result = countNum(n-1) + countNum(n-2);
        }
        return result;
    }
    
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of Stairs: ");
        int n = sc.nextInt();

        //function calling
        int result = countNum(n+1);  // relationship between count of stairs problem and fibonnaci series problem
        System.out.println("Number of ways is: " + result);
    }
}
