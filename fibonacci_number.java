import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
      Scanner scn = new Scanner(System.in);
      int num = scn.nextInt();
      
      int prev = 0;
      int curr = 1;
      
      for(int i = 1; i <= num; i++){
        int next = prev + curr;
        prev = curr;
        curr = next;
      }
      
      System.out.println(prev);
      
    }
}
