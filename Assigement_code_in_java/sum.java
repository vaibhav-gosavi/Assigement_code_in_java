/* Write a program to print sum two values. Get two values from the user and print the sum.

Input Format:
Input value contains two numbers

Constraints:
NIL

Output Format:
Print the sum of two values like x + y = sum

Sample Input:
10 20

Sample Output :
10.0 + 20.0 = 30.0

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
   double x,y,sum;
        Scanner sc=new Scanner(System.in);
        x =sc.nextDouble();
        y=sc.nextDouble();
        sum=x+y;
        System.out.printf("%.1f + %.1f = %.1f",x,y,sum);
    }
}