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
            if(arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char)(arr[i] + 32);
            }
        }
        
        int start = 0;
        int end = arr.length-1;
        
        while(start < end) {
            if(arr[start] != arr[end]){
                System.out.println("false");
                return;
            }
            start++;
            end--;
        }
        System.out.println("true");
    }
}
