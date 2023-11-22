import java.util.Objects;

public class Product implements Cloneable{
    private String name;
    private Double price;
    private String info;

    public Product(String name, Double price, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
    }
    @Override
    protected Product clone() {
        return new Product(this.name, this.price, this.info);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", info='" + info + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price) && Objects.equals(info, product.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, info);
    }
}
