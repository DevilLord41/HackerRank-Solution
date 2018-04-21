import java.util.Scanner;

public class GradingStudents {
    
    /*
     * https://www.hackerrank.com/challenges/grading/problem
     */
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	for(int i = 0; i < T;i++) {
    		System.out.println(doGrading(sc.nextInt()));
    	}
    	sc.close();
	}
    
    public static int doGrading(int n) {
    	if(n < 38) return n;
    	int count = 0;
    	for(int i = n;i%5!=0;i++)
    		count++;
    	
    	return count<3?n+count:n;
    }
    
    

}
