public class Product {
    public String getName() {return name; }

    public void setName(String name) {this.name = name; }
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public int getCaloriesIn100g() {
        return caloriesIn100g;
    }

    public void setCaloriesIn100g(int caloriesIn100g) {
        this.caloriesIn100g = caloriesIn100g;
    }


    private String name;
    private Double price;
    private Double weight;
    private int caloriesIn100g;



    public Product(String name, Double price, Double weight, int caloriesIn100g) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.caloriesIn100g = caloriesIn100g;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product ");
        sb.append("name ").append(name).append(" |");
        sb.append("price ").append(price).append("$ |");
        sb.append("weight ").append(weight).append("g |");
        sb.append("caloriesIn100g ").append(caloriesIn100g).append("kcal |");
        return sb.toString();
    }
}
