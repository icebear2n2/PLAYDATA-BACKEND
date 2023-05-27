import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test1 {
    static Scanner sc;
    static Map<String, String> map = new HashMap<>();
    public static void main(String[] args) {
        // 입력을 받아서
        // apple 사과
        // banana 바나나
        sc = new Scanner(System.in);
        input();
        find();
        delete();
        update();
    }
    public static void input() {
        System.out.println("1. insert 2. delete 3. update 4. find 5.exit");
        int i = Integer.parseInt(sc.nextLine());
        modeSelect(i);
        System.out.println();

    }
    public static void insert() {
        System.out.println("영단어 입력");
        String key = sc.nextLine();
        System.out.println("한국어 입력");
        String value = sc.nextLine();
        if(isVaild(key, true)) map.put(key, value);
        input();

    }
    public static void delete() {
        System.out.println("삭제할 Value에 대한 Key 입력");

        String key = sc.nextLine();
        if (isVaild(key)) {
            System.out.println("key: " + map.remove(key) + " 의 value을 삭제합니다.");
        }
        input();
    }
    public static void update() {
        System.out.println("영단어 입력");
        String key = sc.nextLine();
        System.out.println("한국어 입력");
        String value = sc.nextLine();
        System.out.println("새로운 한국어 입력");
        String newValue = sc.nextLine();
        if (isVaild(key)) {
            map.replace(key, value, newValue);
        }

        input();
    }

    public static void find() {
        System.out.println("키 입력");
        String key = sc.nextLine();
        if (isVaild(key)) {
            System.out.println("찾은 key: " + key + " 의 value: " + map.get(key));
        }
        input();
    }

    public static boolean isVaild(String key) {
        if (map.containsKey(key)) {
            return true;
        } else {
            System.out.println("없는 단어입니다. 다시 입력해주세요");
            return false;
        }
    }

    // 오버로드
    public static boolean isVaild(String key, boolean inInsert) {
        if (!map.containsKey(key)) {
            return true;
        } else {
            System.out.println(key + " 는 " + map.get(key) + " 라고 있는 단어입니다.");
            return false;
        }
    }
    public static void modeSelect(int mode) {
        switch (mode) {
            case 1:
                insert();
                break;
            case 2:
                delete();
                break;
            case 3:
                update();
                break;
            case 4:
                find();
                break;
            case 5:
                break;
            default:
                input();
                break;
        }
    }

}

