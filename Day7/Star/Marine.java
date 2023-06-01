package Starcrft;

import java.util.ArrayList;

public class Marine extends Unit {
    int marine_hp, marine_attack, marine_defend, marine_poiint;


    public Marine() {
        super(1,50,6,0);
//        marine_hp = 50;
//        marine_attack = 6;
//        marine_defend = 0;
//        marine_poiint = 1;
    }

    @Override
    public void KillUnit() {
        if (unit < 0){
            System.out.println("삭제할 마린이 없음");
        }
        else {
            unit--;
            people--;
        }
//        public void prinUnitInfo() {
//            System.out.println("마린체력 " + marine_hp + ",공격력 : " + marine_attack + ", 방어력 : " + marine_defend + ", 인구수 " + marine_poiint);
//        }
    }

    @Override
    public void prinUnitInfo() {
        super.prinUnitInfo();
    }

    @Override
    public void prinUnitPopulation() {
        super.prinUnitPopulation();
    }
    public void Sucsse(){
        Unit.unit++;
        Unit.unit_point++;
    }
}