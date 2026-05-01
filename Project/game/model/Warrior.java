package game.model;
import game.base.Skill;

public class Warrior extends Hero implements Skill {
    public Warrior(String name) {
        super(name, 200);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " menebas dengan Pedang Besar!");
    }

    @Override
    public void useSpecialSkill() {
        System.out.println(getName() + " menggunakan skill: BERSERK MODE!");
    }
}