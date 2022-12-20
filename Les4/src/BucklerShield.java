public class BucklerShield implements Shield {
    @Override
    public Integer absorption() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("BucklerShield %d",absorption());
    }
}
