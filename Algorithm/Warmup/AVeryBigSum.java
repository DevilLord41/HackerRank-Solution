import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AVeryBigSum {
    
    /*
     * https://www.hackerrank.com/challenges/a-very-big-sum/problem
     */
    
    static long aVeryBigSum(int n, long[] ar) {
        BigDecimal result = new BigDecimal("0");
        for(int i = 0;i < ar.length;i++) {
            result = result.add(new BigDecimal(ar[i]));
        }
        
        return result.longValue();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }
}
