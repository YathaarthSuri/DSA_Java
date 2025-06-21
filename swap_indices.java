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
      int[] arr = new int[num];
      for(int i = 0; i < num; i++) {
        arr[i] = scn.nextInt();
      }
      
      int idx1 = scn.nextInt();
      int idx2 = scn.nextInt();
      int temp;
      temp = arr[idx1];
      arr[idx1] = arr[idx2];
      arr[idx2] = temp;
      
      for(int i = 0; i < num; i++) {
        System.out.print(arr[i]+" ");
      }
      
    }
}
