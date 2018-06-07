package lesson11.homework11_1;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args)
    {
        Scanner In = new Scanner(System.in);
        int [] number = new int []{1,1,1,1,2,2,3,4,4,4};

        boolean [] distinct = new boolean [10];

        int count = 0;
        for (int i = 0; i < number.length; i++)
        {
            if (isThere(number,i) == false)
            {
                distinct[i] = true;
                count++;
            }
        }
        System.out.println("\nThe number of distinct numbers is  " + count);
        System.out.print("The distinct numbers are: ");
        displayDistinct(number, distinct);
    }

    public static boolean isThere(int [] number, int i)
    {
        for (int j = 0; j < i; j++)
            if(number[i] == number[j])
                return true;
        return false;
    }
    public static void  displayDistinct(int [] number, boolean [] distinct)
    {
        for (int i = 0; i < distinct.length; i++)
            if (distinct[i])
                System.out.print(number[i] + " ");
    }
}
