import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int noOfQueries = scn.nextInt();
        int[] queries = new int[noOfQueries];
        int[] arr = new int[arraySize];
        for(int i = 0; i < arraySize; i++) {
            arr[i] = scn.nextInt();
        }
        for(int i = 0; i < noOfQueries; i++) {
            queries[i] = scn.nextInt();
        }
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int value : arr) {
            if(hm.containsKey(value)) {
                hm.put(value, hm.get(value) + 1);
            } else {
                hm.put(value, 1);
            }
        }
        
        for(int value : queries) {
            if(hm.containsKey(value)) {
                System.out.println(hm.get(value));
            } else {
                System.out.println(0);
            }
        }
    }
}
