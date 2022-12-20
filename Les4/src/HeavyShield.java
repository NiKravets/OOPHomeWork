public class HeavyShield implements Shield{
    @Override
    public Integer absorption() {
        return 20;
    }

    @Override
    public String toString() {
        return String.format("HeavyShield %d",absorption());
    }
}
