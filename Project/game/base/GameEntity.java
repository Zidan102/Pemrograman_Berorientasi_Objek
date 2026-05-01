package game.base;

public abstract class GameEntity {
    private String name;

    public GameEntity(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    
    public abstract void attack();
}