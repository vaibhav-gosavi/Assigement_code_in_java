/* Write a Program to calculate the compound interest.
Compound interest (or compounding interest) is the interest on a loan or deposit calculated based on both the initial principal and the accumulated interest from previous periods. Thought to have originated in 17th-century Italy, compound interest can be thought of as "interest on interest," and will make a sum grow at a faster rate than simple interest, which is calculated only on the principal amount.
The formula for calculating compound interest is:
Compound interest = total amount of principal and interest in future (or future value) less principal amount at present (or present value) = [P (1 + i)n] – P = P [(1 + i)n – 1] Where:
P = principal i = nominal annual interest rate in percentage terms n = number of compounding periods

Input Format:
Get values for Principal amount in the first line Rate of interest in the second line Number of periods in the third line

Constraints:
All three inputs should be > 0

Output Format:
Print the calculated compound interest. The result should be rounded into two decimals.

Sample Input :
10000
12
3
Sample Output :
4049.28

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
        double p;
        double i;
        double n;
        p=sc.nextDouble();
        i= sc.nextDouble();
        n=sc.nextDouble();
        i=(1+i/100);
        i=Math.pow(i,n);
        double a=p*i;
        double ci=a-p;
        System.out.printf("%.2f",ci);
    }
}