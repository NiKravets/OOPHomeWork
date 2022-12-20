public class Bandit extends Warrior<Mace,BucklerShield> {
    public Bandit(String name, Integer hp, Mace weapon, BucklerShield shield) {
        super(name, hp, weapon, shield);
    }
    @Override
    public String toString() {
        return String.format("Bandit %s ",super.toString());
    }
}
