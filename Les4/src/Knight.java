public class Knight extends Warrior<BastardSword,HeaterShield>{
    public Knight(String name, Integer hp, BastardSword weapon, HeaterShield shield) {
        super(name, hp, weapon, shield);

    }

    @Override
    public String toString() {
        return String.format("Knight %s ",super.toString());
    }
}
