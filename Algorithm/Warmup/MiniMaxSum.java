import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MiniMaxSum {
    
    /*
     * https://www.hackerrank.com/challenges/mini-max-sum/problem
     */

    static void miniMaxSum(int[] arr) {
        ArrayList<Long> r = new ArrayList<Long>();
        for(int i = 0; i < arr.length;i++) {
            long sum = 0;
            for(int j = 0; j < arr.length;j++) {
                if(i!=j) sum+= arr[j];
            }
            r.add(sum);
        }
        System.out.println(Collections.min(r) + " " + Collections.max(r));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
