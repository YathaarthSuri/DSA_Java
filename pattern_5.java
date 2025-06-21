/*
    1
  2 3 2
3 4 5 4 3
  2 3 2
    1
*/

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
        
        int nst = 1;
        int nsp = n/2;
        int val = 1;
                
         for(int i = 1; i <= n; i++) {
             if(i <= n/2) {
                 val = i;
             }
             else {
                 val = n - i + 1;
             }
             
            for(int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
           
            for(int j = 0; j < nst; j++) {
                System.out.print(val + " ");
                if(j < nst/2){
                    val++;
                }
                else {
                    val--;
                }
            } 
             
            System.out.println();
            if(i <= n/2) {
                nst += 2;
                nsp--;
            }
            else {
                nst -= 2;
                nsp++;
                val -= 2;
            }   
        }
      
    }
}
