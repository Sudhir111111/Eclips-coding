package p2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice3 {

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
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        repeatStringNo(arr);
    }

}
