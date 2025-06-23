import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static long distinctPoints(int[] xArr, int[] yArr) {
        int count = 0;
        HashSet<String> hs = new HashSet<>();
        for(int i = 0; i < xArr.length; i++) {
            hs.add(xArr[i]+" "+yArr[i]);
        }
        return hs.size();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] xArr = new int[n];
        int[] yArr = new int[n];
        for(int i = 0; i < n; i++) {
            xArr[i] = scn.nextInt();
        }
         for(int i = 0; i < n; i++) {
            yArr[i] = scn.nextInt();
        }
        System.out.println(distinctPoints(xArr, yArr));
    }
}
