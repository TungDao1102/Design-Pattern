import java.util.ArrayList;
import java.util.List;

public class Box implements Product{
    private List<Product> bottles = new ArrayList<>();

    public void Add(Product bottle){
        bottles.add(bottle);
    }

    public  void Remove(Product bottle){
        bottles.remove(bottle);
    }
    @Override
    public int GetPrice() {
        return bottles.stream().mapToInt(Product::GetPrice).sum();
    }
}
