import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SimpleArraySum.java {
  
    /*
     * https://www.hackerrank.com/challenges/simple-array-sum/problem
     */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = 0;
        for(int i = 0;i<ar.length;i++) {
            result += ar[i];
        }
        System.out.println(result);
    }
}
