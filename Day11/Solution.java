import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String binary = Integer.toBinaryString(n);

        int maxCount = 0;
        int currentCount = 0;

        for (char bit : binary.toCharArray()) {
            if (bit == '1') {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        System.out.println(maxCount);

        bufferedReader.close();
    }
}