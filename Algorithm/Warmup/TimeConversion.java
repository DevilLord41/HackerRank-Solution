import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /*
     * https://www.hackerrank.com/challenges/time-conversion/problem
     */
    
    static String timeConversion(String s) {
        String res = "";
        String sp = s.contains("PM") ? "PM" : "AM";
        try {
            SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
            SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ss a");
            //System.out.println(String.join(" ",s.split("PM")) + " PM");
            Date date = parseFormat.parse(String.join(" ",s.split(sp)) + " "+sp);
            //System.out.println(displayFormat.format(date));
            return displayFormat.format(date);
        } catch(Exception e) {
            
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
