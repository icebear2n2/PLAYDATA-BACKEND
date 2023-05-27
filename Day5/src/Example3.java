//import java.util.*;
//
//public class Example3 {
//    static Scanner sc;
//    public static void main(String[] args) {
//        // 서울에 박씨 김씨
//        // 부산에 이씨
//        // 대전 노씨
//        // 제주 류씨
//        Map<String, List<Person>> map = new HashMap<>();
//        List<String> result = new ArrayList<>();
//        sc = new Scanner(System.in);
//
//        while (true) {
//
//
//            System.out.println("지역 이름 입력");
//            String region = sc.next();
//            List<Person> getList = map.getOrDefault(region, new ArrayList<Person>());
//            List<String> names = new ArrayList<>();
//            if(region.equals("exit")) break;
//
//            int count = 0;
//            while (true) {
//
//                System.out.println("이름 입력");
//                String name = sc.next();
//                if(region.equals("exit")|| name.equals("exit")) break;
//                System.out.println("나이 입력");
//                int age = sc.nextInt();
//
//                getList.add(new Person(name, age));
//                map.put(region, getList);
//                names.add(map.get(region).get(count).getName());
//                count += 1;
//
//            }
//            result.add((region + ": " + names));
//            System.out.println(result);
//
//
//        }
//        sc.close();
//    }
//
//}
//
//class Person {
//    String name;
//    int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}