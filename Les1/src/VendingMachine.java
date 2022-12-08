import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();
    private final static List<Product> initProduct = new ArrayList<>();

    static {
        initProduct.add(new Product("snickers", 0.5, 50.5, 250));
    }

    public VendingMachine() {
        this(initProduct);
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProductBy(String inName) {
        for (Product product : products) {
            if (product.getName().contains(inName)) {
                return product;
            }
        }
        return null;
    }
    public Product getProductBy(Double inPrice) {
        for (Product product : products) {
            if (product.getPrice().equals(inPrice)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "";
        for (Product product:products) {
            result = result.concat(product.toString()+"\n");
        }
        return result;
    }
}
