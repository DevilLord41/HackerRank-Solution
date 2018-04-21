import java.io.*;
import java.util.*;

public class PlusMinus {
    
    /*
     * https://www.hackerrank.com/challenges/plus-minus
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int much = sc.nextInt();
        sc.nextLine();
        String m = sc.nextLine();
        String[] splitted = m.split(" ");
        double zero = 0, pos = 0,neg = 0;
        for(int i = 0; i < splitted.length;i++) {
            int number = Integer.parseInt(splitted[i]);
            if(number == 0) {
                zero++;
            }
            if(number < 0) {
                neg++;
            }
            if(number > 0) {
                pos++;
            }
        }
        double[] res = new double[3];
        res[0] = pos / much;
        res[1] = neg / much;
        res[2] = zero / much;
        
        System.out.println(res[0]);
        System.out.println(res[1]);
        System.out.println(res[2]);
    }
}
