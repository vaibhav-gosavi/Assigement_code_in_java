/* Write a program that inputs a student's marks and prints his grade according to the following rules :
Marks Grade 76 - 100 A 51 - 75 B 26 - 50 C 0 - 25 D

Input Format
Get single input from the user

Constraints
score should be in between 1 to 100

Output Format
Display equivalent grade

Sample Input :
40
Sample Output :
C

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
        int marks=sc.nextInt();
        if(marks<0 && marks>100){
            System.out.println("invalid output");
        }
        if(marks<=25){
            System.out.println("D");
        }
        if(marks>=26 && marks<51){
            System.out.println("C");
        }
        if(marks>=51 && marks<76){
            System.out.println("B");
        }
        if(marks>76 && marks<=100){
            System.out.println("A");
        }
    }
}