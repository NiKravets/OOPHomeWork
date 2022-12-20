public class Mage extends Warrior<Staff,Shield> {
    private Integer mp;
    private  Integer range;

    public Mage(String name, Integer hp, Staff weapon,Integer range,Integer mp) {
        super(name, hp, weapon);
        this.mp = mp;
        this.range = range;
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public Integer getRange() {
        return range;
    }

    @Override
    public String toString() {
        return String.format("Mage %s mp %d, range %d",super.toString(),mp,range);
    }
}
