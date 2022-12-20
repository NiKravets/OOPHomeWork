public class Hero extends Warrior<Weapon,Shield> {
    public Hero(String name, Integer hp, Weapon weapon) {
        super(name, hp, weapon);
    }

    public Hero(String name, Integer hp, Weapon weapon, Shield shield) {
        super(name, hp, weapon, shield);
    }

    @Override
    public String toString() {
        return String.format("Hero %s ",super.toString());
    }
}
