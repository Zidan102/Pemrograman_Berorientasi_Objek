package game.model;
import game.base.Skill;

public class Mage extends Hero implements Skill {
    public Mage(String name) {
        super(name, 100);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " menembakkan Bola Api!");
    }

    @Override
    public void useSpecialSkill() {
        System.out.println(getName() + " menggunakan skill: METEOR SHOWER!");
    }
}