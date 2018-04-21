import java.util.Scanner;

public class BonAppetit {
    
    /*
     * https://www.hackerrank.com/challenges/bon-appetit/problem
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[t];
        for(int i = 0;i < t;i++) arr[i] = sc.nextInt();
        int charge = sc.nextInt();
        
        int sum = 0;
        for(int i = 0; i < t;i++) {
        	if(i!=k) sum+=arr[i];
        }
        int bActual = sum / 2;
        int res = charge-bActual;
        System.out.println(res == 0 ? "Bon Appetit" : res);
        sc.close();
    }
}
