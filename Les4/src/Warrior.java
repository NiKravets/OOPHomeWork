public abstract class Warrior<T extends Weapon, S extends Shield> {
    private String name;
    private Integer hp;
    private T weapon;
    private S shield;

    public Warrior(String name, Integer hp, T weapon, S shield) {
        this.name = name;
        this.hp = hp;
        this.weapon = weapon;
        this.shield = shield;
    }

    public Warrior(String name, Integer hp, T weapon) {
        this.name = name;
        this.hp = hp;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public S getShield() {
        return shield;
    }

    public void setShield(S shield) {
        this.shield = shield;
    }

    @Override
    public String toString() {
        if (this.shield == null) {
            return String.format("%s, %s, hp %d, ", name, weapon, hp);
        }
        return String.format("%s, %s, %s, hp %d, ", name, weapon, shield, hp);
    }


}
