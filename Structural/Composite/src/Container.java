import java.util.ArrayList;
import java.util.List;

public class Container implements Product{
    private List<Product> products = new ArrayList<>();
    public void Add(Product product){
        products.add(product);
    }

    public  void Remove(Product product){
        products.remove(product);
    }
    @Override
    public int GetPrice() {
        return products.stream().mapToInt(Product::GetPrice).sum();
    }
}
