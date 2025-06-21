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
      int i = 1;
      int ans = 1;

      while(i*i<=num){
          ans = i;
          i++;
      }

      if(ans*ans == num){
         System.out.println(true);
      }else{
           System.out.println(false);
      }
    }
}
