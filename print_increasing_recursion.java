import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void print_increasing_recursion(int n, int x) {
        if(n == 0) {
            return;
        }
        System.out.println(++x);
        print_increasing_recursion(n-1, x);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        print_increasing_recursion(n, 0);
    }
}
