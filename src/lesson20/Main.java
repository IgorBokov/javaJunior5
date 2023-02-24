package lesson20;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(0, "Hi_load");
        System.out.println(map);
        HashMap<String,Integer> map1 = new HashMap<>();
        map1.put("Goga", 323);
        System.out.println(map1);
    }
}
