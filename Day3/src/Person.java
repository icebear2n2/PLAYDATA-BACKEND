public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return "name: " + name ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return "age: " + age;
    }

    public void setAge(int age) {
        this.age = ++age;

    }
}
