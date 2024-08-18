package DSA;

import java.util.HashMap;

public class Pointer {
    public static void main(String[] args) {
        int n = 11;
        int n2 = n;

        n =22;
        System.out.println("num1: " + n);
        System.out.println("num2: "+ n2);

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();

        map1.put("value",11);
        map2 = map1;

        map1.put("value",22);
        System.out.println(map1);
        System.out.println(map2);

    }
}
