public class HeaterShield implements Shield {

    @Override
    public Integer absorption() {
        return 15;
    }

    @Override
    public String toString() {
        return String.format("HeaterShield %d",absorption());
    }
}
