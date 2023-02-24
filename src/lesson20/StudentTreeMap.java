package lesson20;

import java.util.Map;
import java.util.TreeMap;

public class StudentTreeMap {
    public static void main(String[] args) {
        Student student2 = new Student("Petya",18);
        Student student3 = new Student("Roma",17);
        Map<Student,Integer> map =new TreeMap<>();
        map.put(student2,5);
        map.put(student3,5);
        System.out.println(map);
    }
}
