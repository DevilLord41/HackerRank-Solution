import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayDS {
    
    /*
     * https://www.hackerrank.com/challenges/arrays-ds/problem
     */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int arr_i=0; arr_i < n; arr_i++){
            arr.add(in.nextInt());
        }
        Collections.reverse(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
