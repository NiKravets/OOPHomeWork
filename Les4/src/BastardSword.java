public class BastardSword implements Weapon{
    @Override
    public Integer damage() {
        return 25;
    }
    @Override
    public String toString() {
        return String.format("BastardSword %d",damage());
    }
}
