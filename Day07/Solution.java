import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine(); // consume the newline

        for (int t = 0; t < T; t++) {
            String s = sc.nextLine();

            String even = "";
            String odd = "";

            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    even += s.charAt(i);
                } else {
                    odd += s.charAt(i);
                }
            }

            System.out.println(even + " " + odd);
        }

        sc.close();
    }
}