/*
Write a program to print an integral value

Input Format:
Input an integral value

Constraints:
-2^63 <= num <= 2^63-1

Output Format:
Print the Integral value

Sample Input :
32767

Sample Output :
32767

 */

 import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
Scanner sc=new Scanner(System.in);
        long a= sc.nextLong();
        long b= (long) Math.pow(63,0);
        long c= (long) Math.pow(63-1,0);
        if(-2*(b) <= a || a<=2*(63-1))
        {
            System.out.printf(String.valueOf(a));
        }
//        System.out.printf("%.1f",a);
    }
}