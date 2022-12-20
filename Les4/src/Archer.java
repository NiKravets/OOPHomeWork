public class Archer extends Warrior<Bow,Shield>{
    private Integer range;

    public Integer getRange() {
        return range;
    }

    public Archer(String name, Integer hp, Bow weapon, Integer range) {
        super(name, hp, weapon);
        this.range = range;
    }

    @Override
    public String toString() {
        return String.format("Archer %s range %d",super.toString(),range);
    }
}
