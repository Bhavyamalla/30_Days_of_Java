import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<String, String> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String phone = sc.next();

            phoneBook.put(name, phone);
        }

        while (sc.hasNext()) {
            String query = sc.next();

            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }

        sc.close();
    }
}