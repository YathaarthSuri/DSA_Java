import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int count_right_angled_triangle(int[][] arr) {
        HashMap<Integer, Integer> hmx = new HashMap<>();
        HashMap<Integer, Integer> hmy = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(hmx.containsKey(arr[i][0])) {
                hmx.put(arr[i][0], hmx.get(arr[i][0]) + 1);
            } else {
                hmx.put(arr[i][0], 1);
            }
            if(hmy.containsKey(arr[i][1])) {
                hmy.put(arr[i][1], hmy.get(arr[i][1]) + 1);
            } else {
                hmy.put(arr[i][1], 1);
            }
        }
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(hmx.get(arr[i][0]) >= 1 && hmy.get(arr[i][1]) >= 1) {
                count += (hmx.get(arr[i][0]) - 1) * (hmy.get(arr[i][1]) - 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 2; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println(count_right_angled_triangle(arr));
    }
}
