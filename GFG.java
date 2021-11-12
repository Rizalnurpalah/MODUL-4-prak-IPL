/**
 * @(#)GFG.java
 *
 *
 * @author M Rizal Nurpalah
 * @version 1.00 2021/11/7
 */


import java.io.*;

class GFG
{

    // Function to return the
    // sum of all the integers
    // below N which are multiples
    // of either A or B
    static int findSum(int n, int a, int b)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)

            // If i is a multiple of a or b
            if (i % a == 0 || i % b == 0)
                sum += i;

        return sum;
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 1000, a = 3, b = 5;
        System.out.println(findSum(n, a, b));
    }
}