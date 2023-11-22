public class Client {
    public static void main(String[] args) {

        Product product = new ProductBuilder()
                .buildName("Laptop Lenovo")
                .buildPrice(120.5)
                .buildInfo("AMD ChipSet")
                .build();
        System.out.println(product);
    }
}