import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
//    Take Input
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++) {
        arr[i] = scn.nextInt();
      }
      
//    Find the largest and 2nd largest number in the array
      int largest = Integer.MIN_VALUE;
      int secondMax = -1;
      int idx = -1;
      for(int i = 0; i < n; i++) {
        if(arr[i] > largest) {
          secondMax = largest;
          largest = arr[i];
          idx = i;
        }
        else if(arr[i] > secondMax && arr[i] != largest) {
          secondMax = arr[i];
        }
      }
      
//    Compare whether 2 * second largest number is less than largest then others will be less obviously and return the index of largest, but if it is more than the largest the automatically condition is false (Can also do this using a function)
        if(secondMax * 2 <= largest) {
          System.out.print(idx);
        } else {
          System.out.print(-1);
        }
      
    }
}
