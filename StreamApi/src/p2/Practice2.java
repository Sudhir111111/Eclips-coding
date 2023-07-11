package p2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice2 {
    public static void repeatStringNo(String[] s) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        int v;
        for (String s1 : s) {
            if (map.containsKey(s1)) {
                v = map.get(s1);
                map.put(s1, v + 1);
            } else
                map.put(s1, 1);
        }
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of String Array:");
        int n;
        n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        String[] s = new String[n];
        System.out.println("Enter the elements of that String");
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }
        repeatStringNo(s);
    }
}


