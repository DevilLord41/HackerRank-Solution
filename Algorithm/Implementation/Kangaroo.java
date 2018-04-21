import java.util.Scanner;

public class Kangaroo {

    /*
     * https://www.hackerrank.com/challenges/apple-and-orange/problem
     */

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    	int r = 0, o = 0;
        for(int i = 0; i < apples.length;i++) {
        	int x = a+apples[i];
        	if(x >= s && x <= t) r++;
        }
        for(int i = 0; i < oranges.length;i++) {
        	int x = b+oranges[i];
        	if(x >= s && x <= t) o++;
        }
        System.out.print(r + "\n" + o);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }
}
