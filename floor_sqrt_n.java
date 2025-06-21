import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int ans = 0;
      int i = 1;
      
      while(i*i <= n){
        ans = i;
        i++;
      }
      
      System.out.println(ans);
      
    }
}
