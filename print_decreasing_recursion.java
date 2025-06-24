import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void print_decreasing_recursion(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        print_decreasing_recursion(n-1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        print_decreasing_recursion(n);
    }
}
