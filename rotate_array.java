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
      int[] arr = new int[n];
      for(int i = 0; i < n; i++) {
        arr[i] = scn.nextInt();
      }
      int k = scn.nextInt();
      
      if(k > n)  k %= n;
      if(k < 0)  k += n;
      
      reverse(arr, 0, n-1);
      reverse(arr, 0, k-1);
      reverse(arr, k, n-1);
      
      for(int i = 0; i < n; i++) {
        System.out.print(arr[i]+" ");
      }
    }
  
    public static void reverse(int[] arr, int idx1, int idx2) {
      while(idx1 < idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
        idx1++;
        idx2--;
      }
    }
}
