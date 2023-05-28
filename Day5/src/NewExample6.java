import java.util.Arrays;

public class NewExample6 {
    public static void main(String[] args) {
        String excel = "수\t이름\t나이\n" +
                "1\t박\t20\n" +
                "2\t김\t30\n" +
                "3\t이\t40\n" +
                "4\t권\t비공개";

        for (int i=1; i<excel.split("\n").length; i++) {
            String [] arr = excel.split("\n");
            String[] arr2 = arr[i].split("\t");
            String[] columns = arr[0].split("\t");


            if (isNumeric(arr2[2]) == false) {
                Person2 persons = new Person2(Integer.parseInt(arr2[0]), arr2[1], null);
                print(columns, persons);
            }
            else if(isNumeric(arr2[0]) == false) {

                Person2 persons = new Person2(null, arr2[1], Integer.parseInt(arr2[2]));
                print(columns, persons);

            }else {
                Person2 persons = new Person2(Integer.parseInt(arr2[0]), arr2[1], Integer.parseInt(arr2[2]));
                print(columns, persons);
            }

        }

    }
    public static boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void print(String[] column, Person2 person2) {
        System.out.print("{" + column[0] + ": " + person2.getNumber() + ", ");
        System.out.print(column[1] + ": " + person2.getName() + ", ");
        System.out.print(column[2] + ": " + person2.getAge() + "}");
        System.out.println();
    }
}

class Person2{
    private Integer number;
    private String name;
    private Integer age;

    public Person2(Integer number, String name, Integer age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
