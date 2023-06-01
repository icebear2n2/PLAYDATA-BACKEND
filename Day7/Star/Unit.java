package Starcrft;

public class Unit {
    int people = 0;
    static int unit = 0;
    static int unit_point = 0;
    int hp, attack, defend = 0;

    public Unit(int unit, int hp, int attack, int defend) {

        this.hp = hp;
        this.attack = attack;
        this.defend = defend;
    }

    public void KillUnit() {
        unit--;
        people--;
    }

    public void prinUnitInfo() {
        System.out.println("마린체력 " + hp + ",공격력 : " + attack + ", 방어력 : " + defend + ", 인구수 " + unit_point);
    }

    public void prinUnitPopulation() {
        System.out.println("유닛 수 : " + unit + ", 사용중인 인구 수 : " + (unit * unit_point));
    }

}
