import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {
    
    /*
     * https://www.hackerrank.com/challenges/staircase/problem
     */
    
    static void staircase(int n) {
        // Complete this function
        String res = "";
        String space = "";
        int c = 1;
        for(int i =0; i < n-1;i++) space += " ";
        for(int i = 0;i < n;i++) {
            res+=space;
            for(int j = 0; j < c;j++) res += "#";
            c++;
            res+="\n";
            if(space.length() > 1)
                space = space.substring(0,space.length()-1);
            else space = "";
        }
        System.out.print(res);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
