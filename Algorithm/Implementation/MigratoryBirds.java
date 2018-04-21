import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MigratoryBirds {

    /*
     * https://www.hackerrank.com/challenges/migratory-birds/problem
     */

    static int migratoryBirds(int n, int[] ar) {
        List<Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());
        Collections.sort(list);
        int x = 0;
        int res = 0;
        for(int i = n-1;i>=0;i--) {
        	int y = list.get(i);
        	int count = i-list.indexOf(y);
        	i-=count;
        	if(count>=x) {
        		x=count;
        		res=y;
        	}
        }
    	return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
