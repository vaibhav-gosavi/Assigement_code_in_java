/*Write a program to calculate the sum and average of four numbers.

Sum is addition of four values Average is sum of values divided by number of values

Note : Round off sum and average with one decimal point

Input Format

Get four numbers from the users

Constraints

1<=num<10^7

Output Format

print the sum in the first line and average in the second line

Sample Input 0

1 2 3 4
Sample Output 0

Sum = 10.0
Average = 2.5
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b,c,d,avg;
        a= sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        d=sc.nextDouble();
        double sum = a+b+c+d;
        avg =sum/4;
        System.out.printf("Sum = %.1f\n",sum);
        System.out.printf("Average = %.1f",avg);
    }
}