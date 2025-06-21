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
      
      int ans1 = maxDifference2(arr);
      int ans2 = maxDifference3(arr);
      
      System.out.print(Math.max(ans1, ans2));
      
    }
    
  public static int maxDifference2(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      arr[i] += i;
    }
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] > largest)  largest = arr[i];
      if(arr[i] < smallest) smallest = arr[i];
    }
    for(int i = 0; i < arr.length; i++) {
      arr[i] -= i;
    }
    return largest - smallest;
  }
  
  public static int maxDifference3(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      arr[i] -= i;
    }
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] > largest)  largest = arr[i];
      if(arr[i] < smallest) smallest = arr[i];
    }
    for(int i = 0; i < arr.length; i++) {
      arr[i] += i;
    }
    return largest - smallest;
  }
  
}
