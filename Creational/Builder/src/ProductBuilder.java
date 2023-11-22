public class ProductBuilder implements Builder{
    private String name;
    private Double price;
    private String info;
    @Override
    public Builder buildName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Builder buildPrice(Double price) {
        this.price = price;
        return this;
    }

    @Override
    public Builder buildInfo(String info) {
        this.info = info;
        return this;
    }

    @Override
    public Product build() {
        return new Product(name, price, info);
    }
}
