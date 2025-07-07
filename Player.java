public class Player {
    private String name;
    private double health;
    private double attackPower;

    public Player(String name, double health, double attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    //name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //health
    public double getHealth() {
        return health;
    }
    public void setHealth(double health) {
        this.health = health;
    }

    //attackPower
    public double getAttackPower() {
        return attackPower;
    }
    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    public void getDamage() {
         this.health -= attackPower; 
    }
}
