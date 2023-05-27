//import java.util.*;
//
//public class Example2 {
//    public static void main(String[] args) {
////        Map<String, List<>> map = new HashMap<>();
//        Map<String, List<Person>> map = new HashMap<>();
//        // 서울에 박씨 김씨
//        // 부산에 이씨
//        // 대전 노씨
//        // 제주 류씨
//        Scanner sc = new Scanner(System.in);
//        List<Person> getList = map.getOrDefault("서울", new ArrayList<Person>());
//        List<Person> getList1 = map.getOrDefault("제주", new ArrayList<Person>());
////        List<Person> persons = new ArrayList<Person>();
//        getList.add(new Person("박씨", 20));
//
//        map.put("서울", getList);
//        map.put("제주", getList1);
//        List<Person> persons1 = map.get("서울");
//        persons1.add(new Person("김씨", 20));
//        System.out.println(map);
//
//
//
//
//
//
//    }
//}

//class Person {
//    private String name;
//    private int age;
//
//    // 생성자
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