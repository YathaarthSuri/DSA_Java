import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
      Scanner scn = new Scanner(System.in);
      
      int num1 = scn.nextInt();
      int num2 = scn.nextInt();
      int num3 = scn.nextInt();

      
      if(num1 >= num2 && num1 >= num3) {
        System.out.println(num1);
      }
      else if(num2 >= num1 && num2 >= num3) {
        System.out.println(num2);
      }
      else {
         System.out.println(num3);
      }
      
    }
}
