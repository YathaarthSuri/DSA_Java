import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char[] arr = str.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 65 && arr[i] <= 90) {
                arr[i] = (char)(arr[i] + 32);
            }
            else if(arr[i] >= 97 && arr[i] <= 122) {
                arr[i] = (char)(arr[i] - 32);
            }
        }
        String ans = "".valueOf(arr);
        System.out.println(ans);
    }
}
