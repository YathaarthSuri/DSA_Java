import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
      
       Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
        
      boolean flag = false;
     
      for(int i = 2; i*i <= n; i++){
        if(n % i == 0) {
            flag = true;
        }
      }
        
      if(n == 2){
        System.out.println("Prime");
        return;
      }
        
      if(flag == false){
        System.out.println("Prime");
      }
      else {
        System.out.println("Not Prime");
      }
      
    }
}
