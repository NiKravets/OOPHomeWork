import java.util.ArrayList;
import java.util.List;

/*Создать новый продукт на основе Product, сделать ему хотя одно свойства (например, шоколад и каллории) и включить в список продуктов в вендинг машину.
Переопределить toString, для вывода нового поля*/
public class Main {
    public static void main(String[] args) {
        List<Product> prods = new ArrayList<>();
        prods.add(new Chocolate("snickers", 35.0, 50.5, 250,35));
        prods.add(new Chocolate("mars", 32.0, 45.0, 200,23));
        prods.add(new Milk("milk", 79.9, 900.0, 71,5));
        prods.add(new Milk("cheese", 97.5, 100.0, 402,45));
        VendingMachine v1 = new VendingMachine(prods);
        System.out.println(v1);
        System.out.println(v1.getProductBy(32.0));
    }
}
