import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int reverse = 0;
      
      while(n > 0) {
        reverse *= 10;
        reverse += n % 10;
        n /= 10;
      }
      
      System.out.println(reverse);
    }
}
