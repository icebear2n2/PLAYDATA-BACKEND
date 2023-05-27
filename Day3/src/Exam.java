import java.util.*;

public class Exam {
    public static void main(String[] args) {
        // name 과 age를 가지고 있는 person을 만들고
        // input 데이터 :
        // {name: park, age: 20}, {name: kim, age: 14}, {name:lee, age: 24}
        // 한 해가 지나서 한살 먹여야 함 한실씩 먹이고 출력하라
        // output:
        // [{name: park, age: 20}, {name: kim, age: 14}, {name:lee, age: 24}]

        Person person1 = new Person("park", 20);
        Person person2 = new Person("lee", 24);
        Person person3 = new Person("kim", 14);

        List<Person> persons = new ArrayList<Person>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        for (int i=0; i<persons.size(); i++) {
            System.out.print("[" + "{" + persons.get(i).getName() + ", " + persons.get(i).getAge()  + "}");
            if (i == persons.size()-1) {
                System.out.println("]");
                break;
            } else {
                System.out.print(", ");
            }

        }



//        System.out.println(list);
//        System.out.println("{" + person1.getName() + ", " + person1.getAge() + "}");


    }
}

