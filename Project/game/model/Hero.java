package game.model;
import game.base.GameEntity;

public class Hero extends GameEntity {
    private int hp;

    public Hero(String name, int hp) {
        super(name);
        this.hp = hp;
    }

    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = hp; }

    @Override
    public void attack() {
        System.out.println(getName() + " melakukan serangan dasar!");
    }
}