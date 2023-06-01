package Starcrft;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Starcrft.Unit.unit;

public class Homework {
    static int people = 0;
    static int people_limit = 10;
static List<Marine> marines = new ArrayList<Marine>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;

        for (int i=0;i<5;i++){
            Marine marine = new Marine();
            marine.prinUnitInfo();
            marine.prinUnitPopulation();
            marines.add(marine);
        }
        for (int i=0; i<3; i++){
            marines.get(i).Sucsse();
        }
        System.out.println("생산가능한 유닛");{

        }
        Marine marine = new Marine();
        marine.prinUnitInfo();
        marine.prinUnitPopulation();
        marines.add(marine);
        marines.get(0).prinUnitPopulation();
//        marines.get(0).Sucsse();
        marine.prinUnitPopulation();
        marines.get(0).prinUnitPopulation();
//        while (true) {
//            System.out.println("생성하고 싶은 기능의 번호를 입력");
//            System.out.print("1.Marine,2. 취소");
//        }

    }
}




