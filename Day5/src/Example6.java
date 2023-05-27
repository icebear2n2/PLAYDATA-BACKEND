import java.util.*;

public class Example6 {
    static Map<String, List<Person>> map = new HashMap<>();
    public static void main(String[] args) {
        String excel = "수\t이름\t나이\n" +
                "1\t박\t20\n" +
                "2\t김\t30\n" +
                "3\t이\t40\n" +
                "4\t권\t비공개";

        for (int i=1; i<excel.split("\n").length; i++) {
            String[] arr = excel.split("\n");
            String[] str = arr[i].split("\t");
            Person persons = new Person(str[0], str[1], str[2]);

            System.out.print("{name: " + persons.getName() + " number: " + persons.getNumber() + " age: " + persons.getAge() + "}");
            System.out.println();

        }


    }

}

class Person{
    private String  number;
    private String name;
    private String age;

    public Person(String number, String name, String age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
