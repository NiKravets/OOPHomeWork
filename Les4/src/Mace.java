public class Mace implements Weapon{
    @Override
    public Integer damage() {
        return 20;
    }
    @Override
    public String toString() {
        return String.format("Mace %d",damage());
    }
}
