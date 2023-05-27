import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        // 객체 : person (name, age}
        // dict 사전 / banana : 바나나
        Map<String,String > map = new HashMap(); //key, value
        System.out.println(map.put("banana", "바나나"));
        System.out.println(map.get("banana")); // 키를 통해 value를 가지고 온다
        System.out.println(map.put("banana", "노란 바나나"));
        System.out.println(map.get("banana"));
        map.put("kim", "20 서울시 취업준비생(백)");
        map.put("age", "20");
        // 키 알 수 있는지 여부
        for (String key:map.keySet()) {
            System.out.println(key);
        }
        String person = map.get("kim");
//        String ss = "";
//        person.length();

        String[] sp = person.split(" ");
        for (String str : sp) {
            System.out.println(str);
        }
    }
}
