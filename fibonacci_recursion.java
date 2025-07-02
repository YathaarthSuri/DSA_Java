import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int fibonacci_recursion(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        int temp1 = fibonacci_recursion(n-1);
        int temp2 = fibonacci_recursion(n-2);
        return temp1 + temp2;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fibonacci_recursion(n));
    }
} 
