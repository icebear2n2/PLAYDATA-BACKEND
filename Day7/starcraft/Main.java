package starcraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<Marine> list = new ArrayList<>();
    public static void main(String[] args) {
        controller();

    }
    static void controller() {
        System.out.println("1. 마린 생성 2. 마린 상태 확인 3. exit");
        int mode = Integer.parseInt(sc.nextLine());
        selectMode(mode);
    }

    private static void selectMode(int mode) {
        if (mode == 1) create();
        else if (mode == 2) status();
        else if (mode == 3) return;
        else controller();
    }

    static void create() {
        Marine marine = new Marine();
        marine.start();
        list.add(marine);
        controller();
    }
    static void status() {
        System.out.println(list);
        controller();
    }
}
