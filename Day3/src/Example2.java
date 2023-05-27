import java.util.*;

public class Example2 {
    public static void main(String[] args) {
//        int[] arr = new int[3];
//
//        List<Integer> list = new ArrayList();
//        list.add(1);
//        list.add(2);
//        list.add(1);
//        Integer[] tmp = (Integer[]) list.toArray();
//        System.out.println(arr.length);
//        System.out.println(list.remove(1));
//        System.out.println(list.get(0));
//        System.out.println(list.set(0, 3));
//        System.out.println(list);

        // Integer는 자바 object에 속해있고 자바 lang이 자동으로 import가 되어 있다.

        // 리스트를 선언하면 길이에 종속되지 않는다.
        // 리스트에는 참조형 변수를 넣어줘야 한다.

        // 123456789 넣고, 짝수의 합을 구하자

        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            list.add(i);
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("짝수의 합:" + " " + sum);
    }

    // name 과 age를 가지고 있는 person을 만들고
    // input 데이터 :
    // {name: park, age: 20}, {name: kim, age: 14}, {name:lee, age: 24}
    // 한 해가 지나서 한살 먹여야 함 한실씩 먹이고 출력하라
    // output:
    // [{name: park, age: 20}, {name: kim, age: 14}, {name:lee, age: 24}]


}

// Outter Class
class Outter{
    int i;
    // Inner Class
    class Inner{
        int j;
    }
}