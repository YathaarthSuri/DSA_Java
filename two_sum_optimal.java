import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static char pairSum(int[] arr, int sum) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int value : arr) {
            if(hm.containsKey(value)) {
                hm.put(value, hm.get(value) + 1);
            } else {
                hm.put(value, 1);
            }
        }
        for(int value : arr) {
            if(hm.containsKey(sum - value)) {
                if((value == sum - value) && hm.get(value) == 1) {
                    return 'N';
                } else {
                    return 'Y';
                }
            }
        }
        return 'N';
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        System.out.println(pairSum(arr, sum));
    }
}
