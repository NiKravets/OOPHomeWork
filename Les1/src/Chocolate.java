public class Chocolate extends Product{

    public int getCocoa() {return cocoa;}

    public void setCocoa(int cocoa) {this.cocoa = cocoa;}

    private int cocoa;
    public Chocolate(String name, Double price, Double weight, int caloriesIn100g,int cocoa) {
        super(name, price, weight, caloriesIn100g);
        this.cocoa = cocoa;
    }

    @Override
    public String toString() {
        return String.format("%s%s",super.toString(), "cocoa "+cocoa+"% |");
    }
}
