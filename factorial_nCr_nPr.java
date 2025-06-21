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
        int r = scn.nextInt();
        
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nmrFact = factorial(n-r);
        
        int nPr = nFact/nmrFact;
        int nCr = nFact/(rFact * nmrFact);

        
        System.out.println(nFact);
        System.out.println(nPr);
        System.out.println(nCr);

    }
    
    public static int factorial (int num) {
        int result = 1;
        for(int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }
      
    
}
