import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SparseArrays {

    /*
     * https://www.hackerrank.com/challenges/sparse-arrays/problem
     */
    static int findSuffix(ArrayList<String> collections, String queryString) {
    	return Collections.frequency(collections,queryString);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scanner.nextLine().trim());

        ArrayList<String> strings = new ArrayList<String>();

        for (int stringsItr = 0; stringsItr < n; stringsItr++) {
            String stringsItem = scanner.nextLine();
            strings.add(stringsItem);
        }

        int q = Integer.parseInt(scanner.nextLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String queryString = scanner.nextLine();

            int res = findSuffix(strings, queryString);

            bufferedWriter.write(String.valueOf(res));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
