/*Write a program to accept an input float value and print it rounded off to 2 decimals

Input Format

Input contains number with decimal values

Constraints

Nil

Output Format

Print the value

Sample Input 0

113.45678
Sample Output 0

113.46
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
        double a=sc.nextDouble();
        System.out.printf("%.2f",a);
    }
}