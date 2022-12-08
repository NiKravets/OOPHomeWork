public class Milk extends Product{

    public int getFatness() {return fatness;}

    public void setFatness(int fatness) {this.fatness = fatness;}

    private int fatness;


    public Milk(String name, Double price, Double weight, int caloriesIn100g,int fatness) {
        super(name, price, weight, caloriesIn100g);
        this.fatness = fatness;
    }

    @Override
    public String toString() {
        return String.format("%s%s",super.toString(), "fatness "+fatness+"% |");
    }
}
