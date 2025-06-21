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
        
        String ans = "";
        for(int i = 0; i < str.length(); i++) {
            ans = ans + str.charAt(i);
            if (i != str.length() - 1) {
                ans = ans + (str.charAt(i+1) - str.charAt(i));
            }
        }
        System.out.println(ans);
    }
}
