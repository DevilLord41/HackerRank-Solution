import java.util.Scanner;

public class BreakingTheRecords {
  
    /*
     * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
     */

    static int[] breakingRecords(int[] score) {
        int lowest = score[0];
        int highest = score[0];
        int[] res = {0,0};
        for(int i : score) {
        	if(i>highest) {
        		highest = i;
        		res[0]++;
        	}
        	if(lowest>i) {
        		lowest = i;
        		res[1]++;
        	}
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}

